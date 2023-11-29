package ExamplesInJava;

import java.util.HashMap;

public class StringMyPractice {
    public static void main(String[] args) {
        int num = 1;
        String str = "Gowtham";
        str = str.concat("Reddy A");
        System.out.println(str);
        str = str.replace(" ","");
        System.out.println(str);
        HashMap<String,Integer> map = new HashMap<>();
        map.put(str,num);
        System.out.println(map);
        System.out.println(map.get(str));
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0; i < arr.length; i++){
            if(!(i % 2 == 0)){

                System.out.println("Even number");
                System.out.println(arr[i]);
            }
            else{
                System.out.println("Odd number");
                System.out.println(arr[i]);
            }
        }
    }
}
