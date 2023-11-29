package Collections;

import java.util.ArrayList;

import java.util.*;

public class ListIteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Apple");
        arr.add("Banana");
        arr.add("Carrot");
        arr.add("DragonFurit");
        arr.add("Egg");
        arr.add("Frog");
        arr.add("Goat");
        System.out.println(arr);
        arr.remove(4);
        System.out.println(arr);
        ListIterator lIter = arr.listIterator();
        while(lIter.hasNext())
        {
            System.out.print(lIter.next() + "");
        }
        while(lIter.hasPrevious())
        {
            System.out.println(lIter.previous());
            System.out.println(lIter.nextIndex());
        }
        for(String result : arr)
        {
            System.out.println(result);
        }
        for(int i = 0; i < arr.size(); i++)
        {
            System.out.print(i);
        }
    }
}
