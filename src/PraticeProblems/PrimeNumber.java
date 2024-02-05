package PraticeProblems;

import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER : ");
        int fn = sc.nextInt();
        System.out.println("ENTER SECOND NUMBER : ");
        int sn = sc.nextInt();
        System.out.println("List of prime numbers between " + fn + " and " + sn);
        for (int i = fn; i <= sn; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
