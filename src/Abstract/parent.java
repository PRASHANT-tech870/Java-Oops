package Abstract;

public abstract class parent  {
    String goal;
    String name;
    int age;

    public parent(String goal,String name, int age) {
        this.goal = goal;
        this.name = name;
        this.age = age;
    }


     void beat(){
        System.out.println("you mf don't do anything!!");
    }


    abstract void career();



    abstract void partner();



}
