package Collections;

import java.util.*;
public class CovertListToHashSet {
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("number");
        list.add("addition");
        list.add("multiplication");
        list.add("Hello");
        System.out.println(list);
        HashSet<String> hSet = new HashSet<>(list);
        System.out.println(hSet);
        }
    }