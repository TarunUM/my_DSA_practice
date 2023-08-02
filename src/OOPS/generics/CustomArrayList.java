package OOPS.generics;

import java.util.Arrays;

public class CustomArrayList {
    private static int defaultSize = 10;
    private int[] data = new int[defaultSize];
    private int size = 0;

    public CustomArrayList() {
    }

    public void add (int value){
        if(this.isFull()){
            this.resize();
        }
        data[size++] = value;
    }

    public void remove () {
        if(size > 0){
            data[--size] = 0;
        }
    }

    public int get(int index){
        if(index < size){
            return data[index];
        }
        return -1;
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public void resize(){
        defaultSize = data.length*2;
        int[] temp = new int[defaultSize];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public boolean isFull(){
        return size == data.length;
    }

    public int actualSize(){
        return defaultSize;
    }

    public static void main(String[] args) {
        CustomArrayList customArrayList = new CustomArrayList();

        for (int i = 0; i < 25; i++) {
            customArrayList.add(Integer.getInteger("a"));
            System.out.println(customArrayList.toString() + " " + customArrayList.actualSize());
        }

    }
}
