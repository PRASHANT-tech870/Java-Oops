package Generics;

import java.util.*;



public class Main {

    public static void main(String[] args) {

        /*

        ArrayList list2 = new ArrayList<>();

        list2.add(3);
        list2.add("dfe");

        this above thing  can be done


        -> can use T called as generic after the class name to allow for any type called as wildcard
        -> the instantiation should be with Object not primitives like Object[] not int[]
        -> ( T extends Number ) can also be done there

        -> interface can also have generic types like Comparable<T>

         */
        CustomArrayList list = new CustomArrayList();

        list.add(3);
        list.add(2);


        System.out.println(list);
        System.out.println(list.size());
        list.remove();
        System.out.println(list);

        System.out.println();
        CustomGenArrayList<Number> list2 = new CustomGenArrayList<>();
        list2.add(4);
        list2.add(4.7);
        System.out.println(list2);

        ArrayList list3 = new ArrayList<>();

        Map<Integer, Object> map = new HashMap<>();

        list3.add(3L);
        list3.add("dfe");
        System.out.println(list3);
        boolean b = list3 instanceof Object;
        System.out.println(b);

        map.put(1, list3);
        System.out.println(map.get(1));

    }

}
