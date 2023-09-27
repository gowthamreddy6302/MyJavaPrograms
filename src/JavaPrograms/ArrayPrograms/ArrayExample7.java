import java.util.Scanner;

public class ArrayExample7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int[] num = new int[5];
        for (int i = 0; i < num.length; i++) {
            System.out.print("ENTER THE NUMBERS TO ADD = ");
            int num1 = sc.nextInt();
            num[i] = num1;
        }
        for (int var : num) {
            sum+=var;
        }
        System.out.println("THE SUM OF ALL THE NUMBERS ARE = " + sum);
    }
}
