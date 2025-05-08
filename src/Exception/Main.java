package Exception;

public class Main {
    public static void main(String[] args) {
        /*
         error -> cant do anything -> stackoverflowerror
         exception -> can be handled by programming -> divideby zero
         Exception class as many other child classes such as Arithmetic Exception
         use the child classes first and then the parent one
         can also create custom exceptions by extending Exception class super(message)
         */

       // System.out.println(divide(2,3 ));
        int a =2,b=0;
        try {
            throw new Exception("Caught you!");
            //System.out.println(a/b);
        }
        catch(Exception e) {

            System.out.println(e.getLocalizedMessage());
        }


    }

    public static int divide(int a, int b) throws ArithmeticException {
        if(b==0){
            throw new ArithmeticException("Dont ever divide by zero");
        }
        return a/b;
    }
}

