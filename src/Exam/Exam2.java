package Exam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Exam2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<Integer, String> value = new HashMap<>();

        for (int i = 1; i <= 2; i++) {
            System.out.print("Enter a string: ");
            String userInput = scanner.nextLine();
            value.put(i, userInput);
        }
        System.out.println("Available above strings are : ");
        for (HashMap.Entry<Integer, String> entry : value.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue());
        }
        System.out.print("Select a string (1,2): ");
        int selectedStringKey = scanner.nextInt();
        scanner.nextLine();
        String selectedString = value.get(selectedStringKey);
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "LOWERCASE");
        map.put(2, "UPPERCASE");
        map.put(3, "TOSTRING");

        if (selectedString == null) {
            System.out.println("Invalid string selection.");
        } else {
            System.out.println("Select operations:");
            for (HashMap.Entry<Integer, String> entry : map.entrySet()) {
                System.out.println(entry.getKey() + ". " + entry.getValue());
            }
            System.out.print("Operation (1,2,3): ");
            int operation = scanner.nextInt();
            String opValue = map.get(operation);
            if (opValue.equalsIgnoreCase("lowercase")){
                System.out.println("After performing the operation output is: " + selectedString.toLowerCase());
            }
            if (opValue.equalsIgnoreCase("Uppercase")){
                System.out.println("After performing the operation output is: " + selectedString.toUpperCase());
            }
            if (opValue.equalsIgnoreCase("tostring")){
                System.out.println("After performing the operation output is: " + selectedString.toString());
            }
        }
    }
}