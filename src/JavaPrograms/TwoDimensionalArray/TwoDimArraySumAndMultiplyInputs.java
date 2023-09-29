package JavaPrograms.TwoDimensionalArray;

import java.util.Scanner;

public class TwoDimArraySumAndMultiplyInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
           
            for (int j = 0; j < arr.length; j++) {
                 System.out.print("ENTER THE 3 VALUES FOR A ROW = ");
                int arr1 = sc.nextInt();
                arr[i][j] = arr1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            int mul = 1;
            for (int j = 0; j < arr.length; j++) {
                sum+= arr[i][j];
                mul*= arr[i][j];
            }
            System.out.println("SUM OF ALL THE ELEMENTS IN THE ROW = " + i +" is " + sum);
            System.out.println(mul + " IS THE MULTIPLICATION OF ALL THE ELEMENTS IN A ROW");
        }

    }

}
