package LinkedList;

public class Main {
    public static void main(String[] args) {
    LL list = new LL();
    list.insertfirst(3);
        list.insertfirst(4);
        list.insertfirst(5);
        list.insertfirst(6);
        list.display();
        //list.insertend(8);
        //list.display();
        //list.insert(50,3);
        list.deletefirst();
        list.display();

    }
}
