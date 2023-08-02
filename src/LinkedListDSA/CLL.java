package LinkedListDSA;

public class CLL {
    private Node head;
    private Node tail;
    private int size;

    public CLL(){
        this.size = 0;
    }

    public void addFirst(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            tail = node;
            tail.next = head;
            size++;
            return;
        }
        node.next = head;
        head = node;
        tail.next = head;
        size++;
    }
    public void addLast(int data){
        if(head == null){
            addFirst(data);
            return;
        }
        Node node = new Node(data);
        tail.next = node;
        tail = node;
        tail.next = head;
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
        Node node = new Node(data);
        Node prevNode = head;
        for(int i=0; i<index-1; i++){
            prevNode = prevNode.next;
        }
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
        tail.next = head;
        size--;
    }
    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node prevNode = head;
        for(int i=0; i<size-2; i++){
            prevNode = prevNode.next;
        }
        tail = prevNode;
        tail.next = head;
        size--;
    }

    public int getValue(int index){
        if(index == 0){
            return head.data;
        }
        if(index == size-1){
            return tail.data;
        }
        Node temp = head;
        for(int i=0; i<index; i++){
            temp = temp.next;
        }
        return temp.data;
    }

    public void delete(int index){
        if(index == 0){
            deleteFirst();
            return;
        }
        if(index == size-1){
            deleteLast();
            return;
        }
        Node prevNode = head;
        for(int i=0; i<index-1; i++){
            prevNode = prevNode.next;
        }
        prevNode.next = prevNode.next.next;
        size--;
    }

    public void display(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        do{
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }while(temp != head);
        System.out.println("head");
        System.out.println();
    }

    public int getSize(){
        return size;
    }

    private class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data = data;
        }
    }
}
