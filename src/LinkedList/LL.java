package LinkedList;
//single linked list
public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }

    //implements code for insert at the start of the single linked list
    public void insertfirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null)
            tail = head;
        size += 1;
    }
    //display the linked list
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("end");
    }
//alternate way to insert without the usage of tail
//    public void insertend(int val){
//        Node node = new Node(val);
//        if(head == null)
//            insertfirst(val);
//
//        Node temp = head;
//        while(temp.next != null)
//            temp = temp.next;
//        temp.next = node;
//        size++;
//    }
    //implements code for insert at the end of the single linked list
    public void insertend(int val){
        Node node = new Node(val);
        if(tail == null)
            insertfirst(val);

        tail.next=node;
        size++;
    }

    //implements code for insert at a given index of the single linked list
    public void insert(int val, int index){
        if(index == 0) {
            insertfirst(val);
            return;
        }
        if (index == size){
            insertend(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;

        size++;
    }

    //implements code for delete at the start of the single linked list
    public int deletefirst(){
        int val = head.value;
        head = head.next;
        if(head == null)
            tail = null;
        size--;
        return val;
    }

    //delete element at any given index
    public int delete(int index){
        if(index == 0)
            deletefirst();
        if(index == size-1)
            deletelast();
        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }

    //delete at end
    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deletelast(){
        if(head.next == null)
            deletefirst();

        Node secondlast = get(size-2);
        int val = tail.value;
        tail = secondlast;
        tail.next = null;
        return val;
    }

    //find the node of the element present
    public Node find(int value){
        Node node = head;
        while(node!=null){
            if(node.value==value)
                return node;
            node = node.next;
        }
        return null;
    }

    private class Node{
        private int value;
        private Node next;

     public Node(int value){
         this.value = value;
     }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
