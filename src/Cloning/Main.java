package Cloning;

import java.util.Arrays;

public class Main  {
    public static void main(String[] args) throws CloneNotSupportedException {

        /*

        -> in shallow copy only the primitive types are copied a new reference variable while the non-primitive types are pointed to the same
        reference variable. so changing the non-primitive type on one object changes its clone type also
        -> but although strings are non-primitive they are immutable in java so new reference pointer is made.
        -> Cloneable is not an interface still we will use implements to tell jvm.

        -> by default javas Object.clone() gives shallow copy not deep copy


         */
        Human prash = new Human(20,"prashant");
        Human karan = prash.clone();

        System.out.println(karan.name);
        System.out.println(Arrays.toString(karan.arr));
        karan.arr[0] =100;
        karan.name +="new";
        System.out.println(prash.name);
        System.out.println(Arrays.toString(karan.arr));
        System.out.println(Arrays.toString(prash.arr));
    }

}

