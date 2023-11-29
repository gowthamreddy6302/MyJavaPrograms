package Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Admin extends Restaurent {
    public void addItems(String menuItems, Double price, Integer rating, Integer itemCount) {
        super.menuItems.add(menuItems);
        super.price.add(price);
        super.rating.add(rating);
        super.iteamCount.add(itemCount);
    }

    public void removeIteams(String menuIteams) {
        int remove = this.menuItems.indexOf(menuIteams);
        this.menuItems.remove(remove);
        this.price.remove(remove);
        this.iteamCount.remove(remove);
        this.rating.remove(remove);
    }

    public void removeItemsFromOrder(List<String> orderedItems, List<Double> orederedItemPrice,
            List<Integer> orderedItemRating, List<Integer> orderedItemCount, String removeItem) {
        int index = menuItems.indexOf(removeItem);


        if (index >= 0) {
            orderedItems.remove(index);
            orederedItemPrice.remove(index);
            orderedItemRating.remove(index);
            orderedItemCount.remove(index);
        }
    }

    public void itemsList(List<String> menuItems, List<Double> price,
            List<Integer> rating, List<Integer> iteamCount) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(menuItems.get(i) + " : " + price.get(i) + " Rs : "
                    + rating.get(i) + " - STAR RATING : " + iteamCount.get(i) + " ITEMS");
        }
    }

    public static void main(String[] args) {
        Admin admin = new Admin();
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER NUMBER OF ITEAMS TO BE ADD : ");
        int no = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < no; i++) {
            System.out.println("-------------------------------------*ENTER YOUR ITEAM " + (i + 1)
                    + " DETAILS*-------------------");
            System.out.print("ENTER ITEAM NAME : ");
            String menuItem = sc.nextLine();
            System.out.print("ENTER THE PRIZE : ");
            double price = sc.nextDouble();
            System.out.print("ENTER THE RATING : ");
            int ratings = sc.nextInt();
            System.out.print("ENTER THE QUANTITY : ");
            int itemCount = sc.nextInt();
            sc.nextLine();
            admin.addItems(menuItem, price, ratings, itemCount);
        }
        admin.itemsList(admin.menuItems, admin.price, admin.rating, admin.iteamCount);
        System.out.println(
                "------------------------------------*SELECT ITEAMS YOU WANT TO ORDER FROM THE LIST*------------------------");
        System.out.print("SELECT ITEAMS TO ORDER : ");
        int userSlected = sc.nextInt();
        sc.nextLine();
        List<String> mIteams = new ArrayList<>();
        List<Double> givenPrice = new ArrayList<>();
        List<Integer> givenRating = new ArrayList<>();
        List<Integer> givenIteamCount = new ArrayList<>();
        while (userSlected > admin.menuItems.size()) {
            System.out.println("PLEASE ENTER VALID ORDER COUNT FROM THE LIST : ");
            userSlected = sc.nextInt();
            sc.nextLine();
        }
        if (userSlected > admin.menuItems.size()) {
            System.out.print("PLEASE ENTER VALID ITEAM FROM THE GIVEN LIST");
            userSlected = sc.nextInt();
            sc.nextLine();
        }
        for (int i = 0; i < userSlected; i++) {
            System.out.print("PLEASE SELECT ITEM " + (i + 1) + " : ");
            String selectedIteam = sc.nextLine();
            mIteams.add(selectedIteam);
            int addedIteams = admin.menuItems.indexOf(selectedIteam);
            givenRating.add(admin.rating.get(addedIteams));
            givenPrice.add(admin.price.get(addedIteams));
            givenIteamCount.add(admin.iteamCount.get(addedIteams));
        }
        System.out.println("YOURE ORDERED ITEAMS ARE : ");
        admin.itemsList(mIteams, givenPrice, givenRating, givenIteamCount);
        System.out.println(
                "-----------------------------------------*DO YOU WANT TO CANCEL ANY ORDER*-----------------------");
        System.out.print("IF YES PRESS Cancel, NO PRESS Continue : ");
        String confirmation = sc.nextLine();
        if (confirmation.equalsIgnoreCase("Cancel")) {
            System.out.print("ENTER THE ITEM NAME TO CANCEL : ");
            String itemName = sc.nextLine();
            admin.removeItemsFromOrder(mIteams, givenPrice, givenRating, givenIteamCount, itemName);
        }
        System.out.println("AFTER CANCELLING, YOUR ORDER DETAILS ARE :");
        admin.itemsList(mIteams, givenPrice, givenRating, givenIteamCount);
        int totalOrderBill = generateOrderBill(mIteams, givenPrice, givenIteamCount);
        System.out.println("YOUR ORDER ITEAMS BILL : " + totalOrderBill + " Rs.");
        /*
         * System.out.
         * println("------------------------------------*REMOVE THE ITEAM FORM THE LIST*---------------------------"
         * );
         * System.out.print("ENTER THE ITEAM TO REMOVE : ");
         * String removeIteamList = sc.nextLine();
         * admin.removeIteams(removeIteamList);
         * admin.itemsList(admin.menuItems, admin.price, admin.rating,
         * admin.iteamCount);
         */
    }

    public static int generateOrderBill(List<String> mIteams, List<Double> givenPrice, List<Integer> givenIteamCount) {
        int totalOrderBill = 0;
        double discountBill = 0;
        for (int i = 0; i < mIteams.size(); i++) {
            totalOrderBill += (int) (givenIteamCount.get(i) * givenPrice.get(i));
        }
        if (totalOrderBill > 1000) {
            discountBill = totalOrderBill * (0.02);
            totalOrderBill = (int) (totalOrderBill - discountBill);
        }
        return totalOrderBill;
    }
}