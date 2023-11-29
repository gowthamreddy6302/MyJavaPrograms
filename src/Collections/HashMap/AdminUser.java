package Collections.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AdminUser extends RestaurantItems { 
    public void itemsLIst(Map<String, RestaurantItems> map) {
        for (Map.Entry<String, RestaurantItems> me : map.entrySet()) {
            System.out.print(me.getKey() + " : " + me.getValue());
            System.out.println();
        }
    }
    public void removeItem(String item, Map<String, RestaurantItems> orderedItem) {
        orderedItem.remove(item);
    }
    static Map<String, RestaurantItems> itemsMap = new HashMap<>();
    public static void main(String[] args) {
        AdminUser adminUser = new AdminUser();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of items you are going to add : ");
        int no = sc.nextInt();
        sc.nextLine();
        String menuItem;
        for (int i = 0; i < no; i++) {
            System.out.println("Enter your item " + (i + 1) + " details");
            System.out.print("Enter the Item name : ");
            menuItem = sc.nextLine();
            System.out.print("Enter the price : ");
            double price = sc.nextDouble();
            System.out.print("Enter the rating : ");
            int ratings = sc.nextInt();
            System.out.print("Entre the item count : ");
            int itemCount = sc.nextInt();
            sc.nextLine();
            RestaurantItems restaurantItems = new RestaurantItems(price, ratings, itemCount);
            adminUser.addItems(menuItem, restaurantItems);
        }
        System.out.print("Enter a item to print : ");
        String itemName = sc.nextLine();
        System.out.println(itemName + " - " + itemsMap.get(itemName));
        // itemName -> RestaurantItem(p,r,ic)
        // for (Map.Entry<String, RestaurantItems> me : itemsMap.entrySet()) {
        // System.out.print(me.getKey() + ":");
        // System.out.println(me.getValue());
        // }
        System.out.print("How many items you want to order : ");
        int orderCount = sc.nextInt();
        sc.nextLine();
        Map<String, RestaurantItems> mItems = new HashMap<>();
        while (orderCount > itemsMap.size()) {
            System.out.print("Please Enter valid order count : ");
            orderCount = sc.nextInt();
            sc.nextLine();
        }
        Map<String, RestaurantItems> orderedItems = new HashMap<>();
        for (int i = 0; i < orderCount; i++) {
            System.out.print("Please choose Item : " + (i + 1));
            String givenItem = sc.nextLine();
            orderedItems.put(givenItem, itemsMap.get(givenItem));
        }
        System.out.print("Your order details are : ");
        adminUser.itemsLIst(orderedItems);
        System.out.println("do you want to cancel any order");
        System.out.print("If yes enter cancel, No enter continue : ");
        String confirmation = sc.nextLine();
        if (confirmation.equalsIgnoreCase("cancel")) {
            System.out.print("Enter Item name to cancel : ");
            String itemToCancel = sc.nextLine();
            adminUser.removeItem(itemToCancel, orderedItems);
        }
        System.out.println("After cancelling, your order details are ");
        adminUser.itemsLIst(orderedItems);
        double totalOrderAmount = calculateTotalBill(orderedItems);
        System.out.println("your total bill is : " + totalOrderAmount + " Rs. ");
    }
    public static double calculateTotalBill(Map<String, RestaurantItems> orderedItems) {
        double totalBill = 0.0;
        for (Map.Entry<String, RestaurantItems> entry : orderedItems.entrySet()) {
            RestaurantItems item = entry.getValue();
            double itemPrices = item.getPrices();
            totalBill += itemPrices * item.getItemCount();
        }
        return totalBill;
    }
    public void addItems(String menuItem, RestaurantItems restaurantItems) {
        itemsMap.put(menuItem, restaurantItems);
    }
}