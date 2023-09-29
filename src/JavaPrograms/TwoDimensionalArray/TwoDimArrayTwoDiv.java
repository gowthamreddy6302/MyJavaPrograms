package JavaPrograms.TwoDimensionalArray;

public class TwoDimArrayTwoDiv {
    public static void main(String[] args) {
        int[][] arr = {{2,4,6},{3,5,7},{8,10,12}};
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i][j] % 2 == 0){
                    System.out.println(arr[i][j] + " IS DIVISIBLE BY 2");
                }else{
                    System.out.println(arr[i][j] + " IS NOT DIVISIBLE BY 2");
                }
            }
        }
    }
    
}
