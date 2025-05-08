
package Generics;
import java.util.*;

public class CustomArrayList {

    private int [] data;
    private static int DEF_SIZE = 10;
    private int size;


    public CustomArrayList(){
        this.data = new int[DEF_SIZE];
        this.size = 0;
    }
    public void add(int ele) {
        if(isFull()){
            resize();
        }

        data[size]=ele;
        size++;

    }

    private boolean isFull(){
        if(data.length==size){
            return true;
        }
        return false;
    }

    private void resize(){
        int newDefSize = 2*DEF_SIZE;
        int [] temp = new int[newDefSize];
        for(int i=0;i<size;i++){
            temp[i] = data[i];
        }

        data = temp;

    }

    public void remove(){
        size--;
    }

    public int get(int idx){
        return data[idx];
    }

    public int size(){
        return size;
    }

    public void set(int idx, int val){
        data[idx] = val;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(data, 0, size));

    }






}
