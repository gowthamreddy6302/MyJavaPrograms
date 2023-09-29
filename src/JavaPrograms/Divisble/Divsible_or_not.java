import java.net.SocketPermission;
import java.util.Scanner;

public class Divsible_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("PLEASE ENTER THE FIRST NUMBER = ");
        int num1 = sc.nextInt();
        System.out.print("PLEASE ENTER THE SECOND NUMBER = ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        if (sum % 4 != 0) {
            if (sum % 2 == 0) {
                System.out.println("THE NUMBER GIVEN NUMBER IS DIVISIBLE BY 2 NOT DIVISIBLE BY 4");
            } else {
                System.out.println("THE GIVEN NUMBERS IS NOT DIVISIBLE BY BOTH 4 AND 2");
            }
        }
    }
}
