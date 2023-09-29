package JavaPrograms.TwoDimensionalArray;

public class TwoDimArrayPrint {
    public static void main(String[] args){
        int[][] arr = {{1,2,3},{5,6,7},{9,1,1}};
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j] + " " );
            }
            System.out.println("");
        }
        
    }
    
}
