package Cloning;

public class Human implements Cloneable{

    int age;
    String name;
    int [] arr;

    public Human(int age, String name){
        this.age = age;
        this.name = name;
        this.arr = new int []{1,2,3};
    }

//    @Override
//    public Human clone() throws CloneNotSupportedException {
            //shallow copy
//        return (Human) super.clone();
//    }

    public Human clone () throws CloneNotSupportedException{
        //deep copy
        Human twin = (Human) super.clone();
        twin.arr = new int[twin.arr.length];
        for(int i=0;i<twin.arr.length;i++){
            twin.arr[i] = this.arr[i];
        }

        return twin;
    }


}
