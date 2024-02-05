package PraticeProblems;

public class SortingAGivenArray {
    public static void main(String[] args) {
       int[] arr = {5,8,3,9};
       System.out.println("Original array : ");
       for (int i = 0;i< arr.length;i++){
           System.out.print(arr[i]+" ");
       }
       for (int i = 0; i < arr.length; i++){
           for (int j = i+1; j < arr.length;j++){
               if (arr[i] > arr[j]){
                  int temp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = temp;
               }
           }
       }
        System.out.println();
        System.out.println("AFTER SORTING  : ");
       for (int i = 0; i < arr.length;i++){
           System.out.print(arr[i]+ " ");
       }
    }
}