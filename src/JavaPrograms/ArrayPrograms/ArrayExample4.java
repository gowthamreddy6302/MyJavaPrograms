import java.util.Scanner;

public class ArrayExample4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] val = new int[5];
        for (int i = 0; i < val.length; i++) {
            System.out.print("ENTER THE NUMBER = ");
            int num = sc.nextInt();
            val[i] = num;
        }
        for(int i = 0; i < val.length; i++){
            if(val[i] % 2 == 0){
                // int res = val[i] *10;
               // System.out.println("AFTER MULTIPLY WE GET " + val[i] + " TURNS INTO " + res + ".");
               System.out.println(val[i]+ " IS A EVEN");
            }else{
                System.out.println(val[i]+ " IS A ODD NUMBER");
            }
        }
    }
}
