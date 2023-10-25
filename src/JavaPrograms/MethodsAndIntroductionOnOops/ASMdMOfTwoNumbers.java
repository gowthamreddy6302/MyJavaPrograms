package JavaPrograms.MethodsAndIntroductionOnOops;

import java.util.Scanner;

public class ASMdMOfTwoNumbers {


    public static void main(String[] args) {
       
        // SubClass obj = new SubClass();
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter first number ");
        // int num1 = sc.nextInt();
        // System.out.println("Enter second number ");
        // int num2 = sc.nextInt();
        // sc.close();
        // System.out.println(obj.sub(num1, num2));
        // System.out.println(obj.multiply(5, 2));
    }

    public int add(int a, int b) {
        printingName("");
        return a + b;
    }

    public String printingName(String name) {
        String result = "Hi " + name;
        return result;
    }



}

// class SubClass {
//     public int sub(int a, int b) {
//         return a - b;
//     }

//     public int multiply(int a, int b) {
//         return a * b;
//     }
// }