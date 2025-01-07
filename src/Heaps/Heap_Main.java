package Heaps;

import java.util.ArrayList;


public class Heap_Main<T extends Comparable<T>>{
    private ArrayList<T> list;

    public Heap_Main(){
        list = new ArrayList<>();
    }

    private void swap(int first_index, int second_index){
        T temp = list.get(first_index);
        list.set(first_index, list.get(second_index));
        list.set(second_index, temp);
    }

    private int parent(int index){
        return (index-1)/2;
    }

    private int left(int index){
        return (2*index)+1;
    }

    private int right(int index){
        return (2*index)+2;
    }

    public void insert(T ele) {
        list.add(ele);
        up_heap(list.size()-1);
    }

    private void up_heap(int index) {
        if (index == 0) return;
        int p = parent(index);
        if(list.get(index).compareTo(list.get(p)) < 0){
            swap(index, p);
            up_heap(p);
        }
    }

    public T remove () throws Exception{
        if (list.isEmpty()){
            throw new Exception("Removing from Empty array/list");
        }
        T temp = list.getFirst();
        T last_ele = list.removeLast();
        if (!list.isEmpty()){
            list.set(0, last_ele);
            down_heap(0);
        }
        return temp;
    }

    private void down_heap(int index) {
        if (index == list.size()-1){
            return;
        }
        int left = left(index);
        int right = right(index);
        int min = index;
        if (left < list.size() && list.get(min).compareTo(list.get(left)) > 0){
            min = left;
        }
        if (right < list.size() && list.get(min).compareTo(list.get(right)) > 0){
            min = right;
        }
        if (min != index){
            swap(index,min);
            down_heap(min);
        }
    }

    public ArrayList<T> heapsort() throws Exception {
        ArrayList<T> data = new ArrayList<>();
        while (!list.isEmpty()){
            data.add(this.remove());
        }
        list = data;
        return data;
    }

    public void display(){
        System.out.println(list);
    }
}

class main{
    public static void main(String[] args) throws Exception {
        Heap_Main<Integer> heap = new Heap_Main<>();
        heap.insert(5);
        heap.insert(3);
        heap.insert(12);
        heap.insert(25);
        heap.insert(16);
        heap.insert(1);
        heap.insert(2);
        heap.insert(64);
        heap.display();
//        heap.remove();
        System.out.println(heap.heapsort());
        heap.display();
    }
}
