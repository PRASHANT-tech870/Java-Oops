
package Generics;

import java.util.Arrays;

public class CustomGenArrayList<T> {

    private Object [] data;
    private static int DEF_SIZE = 10;
    private int size;


    public CustomGenArrayList(){
        this.data = new Object[DEF_SIZE];
        this.size = 0;
    }
    public void add(T ele) {
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
        Object [] temp = new Object[newDefSize];
        for(int i=0;i<size;i++){
            temp[i] = data[i];
        }

        data = temp;

    }

    public T remove(){
        T removed =(T) (data[size]);
        size--;
        return removed;
    }

    public T get(int idx){
        return (T) data[idx];
    }

    public int size(){
        return size;
    }

    public void set(int idx, T val){
        data[idx] = val;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(data, 0, size));

    }






}
