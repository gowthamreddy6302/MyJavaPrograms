package Multi_Threading;
import java.util.*;

public class OutOfMemoryError {
    public static void main(String[] args) throws Exception {
//            List obj = new ArrayList<>();
//            Random obj1= new Random();
//            while (true)
//                obj.add(obj1.nextInt());
//        }
//        Integer[] a = new Integer[100000 * 10000 * 1000];
//        System.out.println("Done");
        Map a = new HashMap();
        a = System.getProperties();
        Random b = new Random();
        while (true) {
            a.put(b.nextInt(), "RandomValue");
        }
    }
}
