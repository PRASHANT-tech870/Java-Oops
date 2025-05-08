package Generics.Comparable;

import java.util.Arrays;
import java.util.Comparator;


public class Main  {
    public static void main(String[] args) {

        /*

         -> Comparable interface has compareTo interface
         ->  Arrays.sort(arr, ((o1, o2) -> o1.rollno-o2.rollno)); this is only lambda expression
         */
        Student st1 = new Student(1,100);
        Student st2 = new Student(2,200);
        Student st3 = new Student(3,300);

        Student [] arr = {st2,st3,st1};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, ((o1, o2) -> o1.rollno-o2.rollno));

        System.out.println(Arrays.toString(arr));


        if(st1.compareTo(st2) < 0) {
            System.out.println("st1 is less than st2");
        }





    }

}
