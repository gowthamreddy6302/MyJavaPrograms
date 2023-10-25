package JavaPrograms.MethodsAndIntroductionOnOops;

public class Arrayofobj {

    public static void main(String[] args) {
        int[] arr = { 7, 9, 5, 4, 3, 2, 6, 12, 15, 19, 25};
        Method obj = new Method();
        obj.EvenOdd(arr);
    }
}
class Method {
    public void EvenOdd(int[] arr) {
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        int[] even = new int[evenCount];
        int[] odd = new int[oddCount];
        int a = 0;
        int b = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even[a] = arr[i];
                a++;
            } else {
                odd[b] = arr[i];
                b++;
            }
        }
        System.out.println("EVEN NUMBERS ARE :");
        for (int ev : even) {
            System.out.print(ev + " ");
        }
        System.out.println("\n ODD NUMBERS ARE : ");
        for (int od : odd) {
            System.out.print(od + " ");
        }
    }
}
