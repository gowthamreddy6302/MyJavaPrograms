package StringHandling;

import java.util.Scanner;

public class UserInputStringOperations {
    public static void main(String[] args) {

 //       ----------------------- STRING BUFFER ---------------------
        String str = "hello";
        str.concat("world");
        System.out.println(str);
        StringBuffer str1 = new StringBuffer("hello");
        str1.append("world"); // APPENDING THE VALUE FOR STRING BUFFER OBJ
        str1.replace(5,10,"java"); // REPLACING THE STRING BUFFER OBJ INTO "java"
        str1.ensureCapacity(30); // TOTAL ENSURE CAPACITY BY FALLOWING ENSURE CAPACITY FORMULA
        System.out.println(str1.capacity()); // TOTAL CAPACITY OF STRING BUFFER OBJ
        str1.insert(9,6302);
//        str1.reverse(); // REVERSE OF A GIVEN STRING BUFFER OBJ
       System.out.println(str1);
//        Scanner sc = new Scanner(System.in);
//        System.out.print("ENTER THE VALUE STRING : ");
//        String s1 = new String(sc.nextLine());
//        System.out.print("ENTER THE SECOND STRING : ");
//        String s2 = new String(sc.nextLine());
//        if (s1.equals(s2) && s1.compareTo(s2) == 0) {
//            System.out.println("THE GIVEN STRINGS ARE EQUAL");
//        } else {
//            System.out.println("THE GIVEN STRINGS ARE NOT EQUAL");
//        }
    }
}
