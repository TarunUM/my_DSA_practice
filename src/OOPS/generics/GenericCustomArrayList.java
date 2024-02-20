package OOPS.generics;

import java.util.Arrays;
import java.util.List;

// T should be either String or any of its subclasses
public class GenericCustomArrayList<T extends String> {
    private static int defaultSize = 10;
    private Object[] data = new Object[defaultSize];
    private int size = 0;

    public Object[] getData() {
        return data;
    }

    public void setData(List<? extends String> list) {
        this.data = list.toArray();
    }

    public GenericCustomArrayList() {
    }

    public void add (T value){
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

    public T get(int index){
        if(index < size){
            return (T) data[index];
        }
        return null;
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
        Object[] temp = new Object[defaultSize];
        System.arraycopy(data, 0, temp, 0, data.length);
//        for (int i = 0; i < data.length; i++) {
//            temp[i] = data[i];
//        }
        data = temp;
    }

    public boolean isFull(){
        return size == data.length;
    }

    public int actualSize(){
        return defaultSize;
    }

    public static void main(String[] args) {
        GenericCustomArrayList<String> customArrayList = new GenericCustomArrayList<>();

        for (int i = 0; i < 26; i++) {
            customArrayList.add(String.valueOf((char) ('a'+i)));
        }
        System.out.println(customArrayList.toString() + " " + customArrayList.actualSize());

    }
}
