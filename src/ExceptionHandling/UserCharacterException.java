package ExceptionHandling;

import java.util.Scanner;

public class UserCharacterException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE CHARACTER : ");
        String word = sc.nextLine();
        try {
            if (word.length() > 10 || word.contains("$")) {
                throw new UserException("CHARACTER IS OVERLOADED OR IT MAY CONSIDER ANY SPECIAL WORD ");
            } else {
                System.out.println("program executed");
            }
        } catch (UserException e) {
            throw e;
        }
    /*    finally {
            System.out.println("overload Execution");
        }*/
    }
}
class UserException extends RuntimeException {
    String message;

    public UserException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
