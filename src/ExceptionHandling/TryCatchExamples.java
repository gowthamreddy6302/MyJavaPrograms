package ExceptionHandling;

public class TryCatchExamples {
    public static void main(String[] args) {
//        int a, b, c;
//        try {
//            a = 0;
//            b = 10;
//            c = b / a;
//            System.out.println("This line will not be executed");
//        } catch (ArithmeticException e) {
//            System.out.println("Divided by zero");
//        }
//        System.out.println("After exception is handled");
//    }
//      Multiple catch exception
        try
        {
            Integer in = new Integer("abc");
            in.intValue();

        }
        catch (ArithmeticException e)
        {
            System.out.println("Arithmetic " + e);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Number Format Exception " + e);
        }
    }
}
