package ExceptionHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserValidator {
    static List<User> users = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi Admin. How many User details you want to enter into your system");
        int noOfUsers = sc.nextInt();
        collectUserDetails(noOfUsers);
        System.out.println("******** User Validation ********");
        sc.nextLine();
        System.out.println("Please Enter Username : ");
        String userName = sc.nextLine();
        try {
            validateUserName(userName);
        } catch (UserException ex) {
            throw ex;
        }

        validatePassword();

    }

    public static void validateUserName(String inputUserName) {
        boolean b = false;
        for (User user : users) {
            if (user.userName.equals(inputUserName)) {
                b = true;
                System.out.println("Hi " + inputUserName);
                break;
            }
        }
        if (!b) {
            throw new UserException("Username not found");
        }
    }

    public static void validatePassword() {
        boolean b = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Password : ");
        String enteredPassword = sc.nextLine();
        for (User user : users) {
            if (user.password.equals(enteredPassword)) {
                b = true;
                System.out.println("User login successfully completed.");
                break;
            }
        }
        if (!b) {
            System.out.println(" Invalid password!! Please try again ");
            validatePassword();
        }
    }

    public static void collectUserDetails(int noOfUsers) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= noOfUsers; i++) {
            System.out.println("Please enter user " + i + " Details");
            System.out.println("Please Enter user name : ");
            String username = sc.nextLine();
            System.out.println("Please Enter password");
            String password = sc.nextLine();
            User obj = new User(username, password);
            users.add(obj);
        }
    }
}

class MyException extends RuntimeException {

    String message;

    public MyException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
