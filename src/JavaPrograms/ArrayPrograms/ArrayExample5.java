import java.util.Scanner;

public class ArrayExample5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        String[] str = new String[5];
        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter the INTEGER NUMBER = ");
            int a = sc.nextInt();
            num[i] = a;
            sc.nextLine();
            System.out.print("ENTER THE STRING = ");
            String n = sc.nextLine();
            str[i] = n;
        }

        for (int i = 0; i < str.length; i++) {
            System.out.println("From INTEGER ARRAY " + num[i] + ".");

            System.out.println("FROM STRING ARRAY " + str[i] + ".");
        }

    }

}
