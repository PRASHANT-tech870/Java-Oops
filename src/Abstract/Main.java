package Abstract;

public class Main {



    public static void main(String[] args) {




        /*

        -> Multiple inheritance not possible in java due to confusion of which methods/variable to be used in inherited class

        -> Abstract classes are those classes which have empty methods in them. Child classes inorder to use them must override those methods

        -> cant create objects of an abstract class, but you can create constructor and use super() in child class

        -> abstract static methods cant be created because static means cant be overridden and abstract means we should override
        -> But static method can be created in abstract classes (normal usage)

        -> abstract classes are used to create function  without body definition , but they can have functions that are defined this is the main
            difference between abstract classes and interfaces

         */



        Son son1 = new Son("doctor", "aira", 20, "surprises");
        son1.career();
        son1.partner();

        son1.beat();
    }
}
