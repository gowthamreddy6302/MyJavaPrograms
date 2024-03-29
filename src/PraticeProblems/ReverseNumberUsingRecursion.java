package PraticeProblems;

import java.util.Scanner;

public class ReverseNumberUsingRecursion {
    public static void reverseNumber(int number) {
        if (number < 10) {
//      prints the same number if the number is less than 10
            System.out.println(number);
        } else {
            System.out.print(number % 10);
            reverseNumber(number / 10);
        }
    }

    public static void main(String args[]) {
        System.out.print("Enter the number that you want to reverse: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print("The reverse of the given number is: ");
        ReverseNumberUsingRecursion reverseNumberUsingRecursion = new ReverseNumberUsingRecursion();
        reverseNumberUsingRecursion.reverseNumber(num);
    }
}