package LinkedList;

public class Main {
    public static void main(String[] args) {
    LL list = new LL();
    list.insertfirst(3);
        list.insertfirst(4);
        list.insertfirst(5);
        list.insertfirst(6);
        //display the inserted elements
        list.display();
        list.insertend(8);
        //display the elements with the new element inserted at the end
        list.display();
        list.insert(50,3);
        list.deletefirst();//delete element at the start
        list.display();//display the remaining elements

    }
}
