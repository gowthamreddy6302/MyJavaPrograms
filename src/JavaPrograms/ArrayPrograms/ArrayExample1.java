public class ArrayExample1 {
    public static void main(String[] args) {
        int[] arr1 = { 10, 20, 30, 40, 50 }; // INITIALIZATION
        for (int i = 1; i < arr1.length; i++) { // for ( int var : arr1);
            System.out.println(arr1[i]);
        }
        int[] arr2 = new int[5]; //DECLARATION
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = 10;
            System.out.println(arr2[i]);
        }
    }
}
