package ExceptionHandling;

import java.util.Scanner;

public class AddTwoNumbersException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PLEASE ENTER A NUMBER : ");
        int num1 = sc.nextInt();
        System.out.println("PLEASE ENTER ANOTHER NUMBER : ");
        int num2 = sc.nextInt();
        if (num1 < 0 || num2 < 0) {
            throw new NumberException("GIVEN NUMBER IS LESS THAN ZERO");
        } else {
            int sum = num1 + num2;
            System.out.println("SUM OF TWO NUMBERS IS " + sum);
        }
    }
}

class NumberException extends RuntimeException {
    public NumberException(String message) {
        super(message);
    }
}
