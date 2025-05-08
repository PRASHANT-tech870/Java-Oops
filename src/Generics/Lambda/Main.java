package Generics.Lambda;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        /*

       -> single lined functions are called lambda functions


         */

        Consumer<Integer> fun = (item) -> System.out.println(item*2);

        Operation sum= (a, b) -> a+b;

        Operation mul = (a, b) -> a*b;

        System.out.println(operate(3,5,sum));
        System.out.println(operate(3,5,mul));



    }

    public static int operate(int a, int b, Operation op){
        return op.operate(a,b);
    }


}

interface Operation{
    int operate(int a, int b);
}
