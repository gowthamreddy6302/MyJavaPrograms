package JavaPrograms.TwoDimensionalArray;

import java.util.Scanner;

public class TDASSC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] str = new String[3][3];
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length; j++) {
                System.out.print("ENTER THE STRING = ");
                String str1 = sc.nextLine();
                str[i][j] = str1;
            }
        }
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length; j++) {
                if (str[i][j].contains("@") || str[i][j].contains("$")) {
                    System.out.println(str[i][j] + " THIS STRING CONTAINS SPECIAL CHARECTER");
                } else {
                    System.out.println(str[i][j] + "THIS STRING HAS NO SPECIAL CHARECTER");
                }
            }
        }

    }
}