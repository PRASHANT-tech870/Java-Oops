import static a.hi.sum;



public class oop {
    static class Box{
        String name;
        public Box(String name){

            this.name = name;
        }
    }

    static class Boxcol extends Box{
        String col;

        public Boxcol(String name, String col){
            super(name);

            this.col = col;

        }
    }





    public static void main(String[] args) {

        Boxcol o1 = new Boxcol( "pras", "red");
        System.out.println(o1.name + " " + o1.col);

    }


}
