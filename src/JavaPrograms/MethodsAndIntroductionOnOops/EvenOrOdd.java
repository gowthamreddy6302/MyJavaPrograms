package JavaPrograms.MethodsAndIntroductionOnOops;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER FIRST NUMBER = ");
        int num1 = sc.nextInt();
        System.out.print("ENTER SECOND NUMBER = ");
        int num2 = sc.nextInt();
        Even obj = new Even();
        obj.EvenOrOdd(num1, num2);
    }
}
class Even {

    public void EvenOrOdd(int num1, int num2) {
        int res = num1 + num2;
        if (res % 2 == 0) {
            System.out.println("THE SUM OF TWO NUMBERS IS EVEN ");
        } else {
            System.out.println("IT IS  ODD NUMBER");
        }
    }
}
