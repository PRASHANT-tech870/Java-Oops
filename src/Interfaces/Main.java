package Interfaces;

public class Main {

    /*

     -> variables in interface are static and final we cant change those
     -> abstract class can provide the implementation of the interface but not vice - versa
     -> interfaces do not have constructors
     -> one class can implement multiple interfaces because the methods are overridden in the class itself they are not defined in interface
     -> can do interface to interface inheritance thorough 'extends' (classes to interface is 'implements')
     -> static interface methods should always have a body (because they cant be overridden) and these methods are called via interface names
     -> nested interface can be declared as public/protected/private but the top level interface should be declared as public/default


     */

    public static void main(String[] args) {
        NiceCar car1 = new NiceCar();
        car1.start();
        car1.playmusic();
        car1.acc();
        car1.stop();

        Engine engine = new PowerEngine();
        car1.upgradeEngine(engine);
        car1.start();

        System.out.println(Engine.PRICE);

    }

}
