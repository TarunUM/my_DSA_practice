package LinkedListDSA;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void addFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = node;
        }

        size++;
    }
    public void addLast(int data){
        if (tail == null) {
            addFirst(data);
            return;
        }
        Node node = new Node(data);
        tail.next = node;
        tail = node;
        size++;
    }

    public void add(int index, int data){
        if(index == 0){
            addFirst(data);
            return;
        }
        if(index == size){
            addLast(data);
            return;
        }
        Node prevNode = head;
        for(int i=0; i<index-1; i++){
            prevNode = prevNode.next;
        }
        Node node = new Node(data);
        Node nextNode = prevNode.next;
        prevNode.next = node;
        node.next = nextNode;
        size++;
    }
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        tail = null;
        size--;
    }
    public void deleteLast(){
        if(tail==null ||head == null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp.next!=tail){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
    }

    public void delete(int index){
        if (head == null || tail == null) {
            System.out.println("List is empty");
            return;
        }
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return;
        }
        if(index == 0){
            deleteFirst();
            return;
        }
        if (index == size - 1) {
            deleteLast();
            return;
        }
        Node prevNode = head;
        for(int i=0; i<index-1;i++){
            prevNode = prevNode.next;
        }
        prevNode.next = prevNode.next.next;
        size--;
    }

    public Node get(int index){
        if(head == null){
            System.out.println("List is empty");
            return null;
        }
        if(index < 0 || index >= size){
            System.out.println("Invalid index");
            return null;
        }
        for (int i=0; i<index; i++){
            head = head.next;
        }
        return head;
    }

    public int getValue(int index){
        if(head == null){
            System.out.println("List is empty");
            return -1;
        }
        if(index < 0 || index >= size){
            System.out.println("Invalid index");
            return -1;
        }
        for (int i=0; i<index; i++){
            head = head.next;
        }
        return head.data;
    }

    public int getIndex(int data){
        Node temp = head;
        int index = 0;
        while(temp!=null){
            if(temp.data == data){
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public void size(){
        System.out.println("Size: "+size);
    }

    private static class Node {
        private final int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
