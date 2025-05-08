package Abstract;

public class Son extends parent{
    String lovelang;

    public Son(String goal,String name, int age, String lovelang){
        super(goal, name, age);
        this.lovelang = lovelang;
    }

    @Override
    void beat(){
        System.out.println("I don't do anything. My love language is " + this.lovelang);
    }

    @Override
    void career() {
        System.out.println("i choose " + this.goal);
    }

    @Override
    void partner() {
        System.out.println("i love " + this.name + " she is " + this.age);
    }


}

