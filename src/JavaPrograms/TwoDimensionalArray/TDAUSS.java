package JavaPrograms.TwoDimensionalArray;

import java.util.Scanner;

public class TDAUSS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] str = new String[3][3];
        for (int i = 0; i < str.length; i++) {
            System.out.print("ENTER THE STRING = ");
            for (int j = 0; j < str.length; j++) {
                String str1 = sc.nextLine();
                str[i][j] = str1;
            }
        }
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length; j++) {
                if (str[i][j].length() > 20) {
                    System.out.println(str[i][j] + " IT IS A LENGTHY STRING");
                }
            }
        }
    }
}
