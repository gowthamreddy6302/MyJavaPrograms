package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> iter = new ArrayList<>();
        iter.add("MY");
        iter.add("NAME");
        iter.add("IS");
        iter.add("JHON");
        Iterator it = iter.iterator();
        while (it.hasNext()) {
            System.out.println(it.next() + " ");
        }
    }
}
