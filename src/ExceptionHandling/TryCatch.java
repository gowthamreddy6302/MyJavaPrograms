package ExceptionHandling;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("ENTER THE INTEGER : ");
            int userIntInput = sc.nextInt();
            sc.nextLine();
            System.out.print("ENTER THE STRING : ");
            String userStrInput = sc.nextLine();
            if(userIntInput == 0 || userStrInput.isEmpty()) {
                throw new RuntimeException ("Both inputs could not be 0 and an " +
                        "empty string at the same time");
            }
            else {
                System.out.println("Inputs are valid");
            }
        }
        catch (ArithmeticException R){
            System.out.println("Exception caught " + R);
        }
        catch (Exception RE) {
            System.out.println("AN UN EXPECTED ERROR OCCURRED " + RE);
        }
        finally {
            System.out.println("An unexpected error"); // It will execute at any way...!!
        }
    }
}
