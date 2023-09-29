package JavaPrograms.TwoDimensionalArray;

import java.util.Scanner;

public class TwoDimArrayUsingCheckGraterAndMul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("ENTER THE NUMBER OF EACH ROW = ");
            for (int j = 0; j < arr.length; j++) {
                int arr1 = sc.nextInt();
                arr[i][j] = arr1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            int mul = 1;
            for (int j = 0; j < arr.length; j++) {
                sum += arr[i][j];
                mul *= arr[i][j];
            }
            if (sum > 100) {
                System.out.println("sum of the numbers in the row " + i + " is " + sum + " is exceeding 100");
            }
            if (mul > 100) {
                System.out.println("product of the numbers in the row " + i + " is " + mul + " row exceeding 100");
            }

        }

    }
}
