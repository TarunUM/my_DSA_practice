package LinkedListDSA;

public class DLL {
    private Node head;
    private Node tail;
    private int size;

    public DLL(){
        this.size = 0;
    }

    public void addFirst(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            tail = node;
            size++;
            return;
        }
        node.next = head;
        node.prev = null;
        head.prev = node;
        head = node;
        size++;
    }

    public void addLast(int data){
        if(head == null){
            addFirst(data);
            return;
        }
        Node node = new Node(data);
        tail.next = node;
        node.prev = tail;
        tail = node;
        size++;
    }


    public void add(int index, int data){
        if(index == 0){
            addFirst(data);
            return;
        }
        if (index == size){
            addLast(data);
            return;
        }
        Node node = new Node(data);
        Node prevNode = head;
        for (int i=0; i<index-1; i++){
            prevNode = prevNode.next;
        }
        Node nextNode = prevNode.next;
        prevNode.next = node;
        node.next = nextNode;
        node.prev = prevNode;
        nextNode.prev = node;
        size++;
    }

    public void deleteFirst() {
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        head = head.next;
        head.prev = null;
        size--;
    }

    public void deleteLast(){
        if (head == null){
            System.out.println("List is Empty");
            return;
        }
        tail = tail.prev;
        tail.next = null;
        size--;
    }

    public int getValue(int index){
        if(index == 0){
            return head.data;
        }
        if(index == size-1){
            return tail.data;
        }
        Node node = head;
        for(int i=0; i<index; i++){
            node = node.next;
        }
        return node.data;
    }

    public void delete(int index){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(index == 0){
            deleteFirst();
            return;
        }
        if (index == size-1){
            deleteLast();
            return;
        }
        Node prevNode = head;
        for (int i=0; i<index-1; i++){
            prevNode = prevNode.next;
        }
        Node nextNode = prevNode.next.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
        size--;
    }

    public void display(){
        Node node = head;
        while(node != null){
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public void displayReverse(){
        Node node = tail;
        while(node != null){
            System.out.print(node.data + " <- ");
            node = node.prev;
        }
        System.out.print("null");
        System.out.println();
    }

    public int getSize() {
        return size;
    }

    private static class Node{
        final int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
}
