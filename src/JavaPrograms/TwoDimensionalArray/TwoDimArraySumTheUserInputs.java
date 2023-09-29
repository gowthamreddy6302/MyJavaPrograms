package JavaPrograms.TwoDimensionalArray;

import java.util.Scanner;

public class TwoDimArraySumTheUserInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int[][] arr = new int[3][3];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                System.out.print("ENTER THE VALUES TO ADD = ");
                int arr1 = sc.nextInt();
                arr[i][j] = arr1;
                sum+=arr[i][j];
            }
            
        }
        System.out.println("THE SUM OF ALL THE VALUES ARE = " + sum);
    }
    
}
