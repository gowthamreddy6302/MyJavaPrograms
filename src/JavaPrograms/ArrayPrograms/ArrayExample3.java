import java.util.Scanner;

public class ArrayExample3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str2 = new String[5];
        for(int i = 0; i < str2.length; i++){
        System.out.print("ENTER THE FURIT = ");
        String name1 = sc.nextLine();
        str2[i] = name1;
        }
        for (String string : str2) {
            if(string.equalsIgnoreCase("mango")){
                System.out.println("THE GIVEN FURIT NAME IS " + string + " IT'S A FURIT KING");
            }else{

                 System.out.println("THE GIVEN FURIT IS " + string + ".");
            }
        }
    }
    
}
