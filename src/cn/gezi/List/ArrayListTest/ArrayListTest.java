package cn.gezi.List.ArrayListTest;

import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List<Integer> list = new java.util.ArrayList<>();
        list.add(1);
        list.add(2);

        list.addFirst(5);

        list.add(3,2);
        System.out.println(list);
       // System.out.println(list.get(3));

        Iterator<Integer> it = list.iterator();

        System.out.println(list.contains(1));


    }
}
