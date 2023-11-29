package Exam;

import java.util.Locale;
import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------*ENTER TWO STRINGS*------");
        System.out.print("ENTER STRING 1 : ");
        String str1 = sc.nextLine();
        System.out.print("ENTER STRING 2 : ");
        String str2 = sc.nextLine();
        System.out.print("SELECT A STRING FROM ABOVE : ");
        String inputString = sc.nextLine();
        System.out.println("-----*SELECT OPERATIONS TO PERFORM*------");
        System.out.println("LOWERCASE (1)");
        System.out.println("UPPERCASE (2)");
        System.out.println("TO-STRING (3)");
        System.out.print("ENTER THE OPERATION : ");
        int inputStr = sc.nextInt();
        if (inputStr == 1 && inputString.equalsIgnoreCase(str1) || inputString.equalsIgnoreCase(str2)) {
            System.out.println("AFTER PERFORMING THE OPERATION : " + inputString.toLowerCase());
        }
        if (inputStr == 2 && inputString.equalsIgnoreCase(str1) || inputString.equalsIgnoreCase(str2)) {
            System.out.println("AFTER PERFORMING THE OPERATION : " + inputString.toUpperCase());
        }
        if (inputStr == 3 && inputString.equalsIgnoreCase(str1) || inputString.equalsIgnoreCase(str2)) {
            System.out.println("AFTER PERFORMING THE OPERATION : " + inputString.toString());
        }
        System.out.println("YOU ENTERED STRING IS " + inputString);
    }
}
