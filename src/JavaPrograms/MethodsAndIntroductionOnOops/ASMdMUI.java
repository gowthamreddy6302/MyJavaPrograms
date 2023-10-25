package JavaPrograms.MethodsAndIntroductionOnOops;

import java.util.Scanner;

public class ASMdMUI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER FIRST NUMBER = ");
        int num1 = sc.nextInt();
        System.out.print("ENTER SECOND NUMBER = ");
        int num2 = sc.nextInt();
        sc.close();
        Subclass obj = new Subclass();
        obj.addition(num1, num2);
        obj.subtraction(num1, num2);
        obj.multiplication(num1, num2);
        obj.division(num1, num2);
        obj.modulation(num1, num2);
    }
}

class Subclass {
    public void addition(int num1, int num2) {
        int add = num1 + num2;
        System.out.println("SUM OF TWO NUMBERS = " + add);
    }

    public void subtraction(int num1, int num2) {
        int sub = num1 - num2;
        System.out.println("SUB OF TWO NUMBERS = " + sub);
    }

    public void multiplication(int num1, int num2) {
        int mul = num1 * num2;
        System.out.println("MUL OF TWO NUMBERS = " + mul);
    }

    public void division (int num1, int num2) {
        int div = num1 / num2;
        System.out.println("DIV OF TWO NUMBERS = " + div);
    }

    public void modulation(int num1, int num2) {
        int mod = num1 % num2;
        System.out.println("MOD OF TWO NUMBERS = " + mod);
    }
}
