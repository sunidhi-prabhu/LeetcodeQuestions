package LinkedList;
//double linked list
public class DLL {
    private Node head;

    private class Node{
        private int val;
        private Node prev;
        private Node next;

        Node(int value){
            this.val=value;
        }

        Node(int value, Node next,Node prev){
            this.val=value;
            this.next=next;
            this.prev=prev;
        }
    }

    public void display()
    {
        Node temp = head;
        Node last = null;
        while(temp!=null)
        {
            last = temp;
            System.out.print(temp.val + "\t");
            temp = temp.next;
        }
        System.out.println();
        System.out.println("reverse order is ");
        while(last != null)
        {
            System.out.print(last.val + "\t");
            last = last.prev;
        }
    }


    public void insertbegin(int val)
    {
        Node node = new Node(val);
        node.next=head;
        node.prev=null;
        if(head != null)
            head.prev=node;
        head = node;
    }


    public void insertend(int val)
    {
        Node node = new Node(val);

        if(head == null)
            insertbegin(val);

        Node temp = head;
        while(temp.next != null)
            temp = temp.next;//traversing till the end
        temp.next=node;
        node.next=null;
        node.prev=temp;
    }


    public void insert(int val, int index){
        Node temp = get(index -1);

        if(temp.prev == null)
            insertbegin(val);

        if(temp.next == null)
            insertend(val);

        Node node = new Node(val,temp.next,temp);
        temp.next.prev=node;
        temp.next=node;

    }

    public int deletebegin(){
        Node node = head;
        head = head.next;
        node.next.prev=null;
        return node.val;
    }

    public int deleteend() {
        if(head.next == null)
            deletebegin();

        Node temp = head;
        while(temp.next.next != null)
            temp = temp.next;

       int val = temp.next.val;
        temp.next=null;
        return val;
    }



    //traverse till the specified index
    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }






}
