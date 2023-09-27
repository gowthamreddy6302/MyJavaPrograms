import java.util.Scanner;

public class ArrayExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[5];
        for(int i = 0; i < arr1.length; i++){
            System.out.print("ENTER A NUMBER = ");
            int num1 = sc.nextInt();
            arr1[i]=num1;
        }
        for(int var : arr1){
            System.out.print(var);
        }
    }
    
}
