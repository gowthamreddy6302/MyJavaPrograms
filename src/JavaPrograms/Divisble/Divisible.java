import java.net.SocketPermission;
import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("PLEASE ENTER THE FIRST NUMBER = ");
        int num1 = sc.nextInt();
        System.out.print("PLEASE ENTER THE SECOND NUMBER = ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        if (sum % 2 == 0 && sum % 4 == 0) {
            System.out.println("THE GIVEN NUMBERS " + num1 + " AND " + num2 + " ARE DIVISIBLE BY 2 AND 4");
        } else {
            System.out.println("THE GIVEN NUMBERS " + num1 + " AND " + num2 + " ARE NOT DIVISIBLE BY 2 AND 4");
        }

    }
}
