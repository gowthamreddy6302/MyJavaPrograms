package AutoBoxing_Unboxing;

import java.util.ArrayList;

public class UnBoxing_Example {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(100); // autoboxing int to Integer
        arrayList.add(200);
        arrayList.add(300);
        for (Object i : arrayList) {
            System.out.println(i);
        }
        // unboxing Integer to int type
        int first = (int) arrayList.get(0);
        System.out.println("int value " + first);
    }
}
