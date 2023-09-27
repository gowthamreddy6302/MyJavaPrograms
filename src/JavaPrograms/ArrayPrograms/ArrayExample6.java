import java.util.Scanner;

public class ArrayExample6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        for (int i = 0; i < num.length; i++) {
            System.out.print("ENTER THE NUMBERS WHEATHER THEY ARE EVEN OR ODD = ");
            int num1 = sc.nextInt();
            num[i] = num1;
        }
        System.out.print("THE EVEN NUMBERS ARE = ");
        for (int var : num) {
            if (var % 2 == 0) {
                System.out.print(var + " ");
            }
        }
        System.out.println("");
        System.out.print("THE ODD NUMBERS ARE = ");
        for (int var : num) {
            if (var % 2 != 0) {
                System.out.print(var + " ");
            }
        }

    }

}
