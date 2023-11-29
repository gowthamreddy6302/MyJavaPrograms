package ExceptionHandling;

import java.util.Scanner;

public class ExceptionsWithStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER USER-NAME : ");
        String str = sc.nextLine();
        if(str.contains("$")) {
            System.out.println("USER IS NOT VALID");
        }
        else{
            System.out.println("VALID USER-NAME");
        }
    }
}