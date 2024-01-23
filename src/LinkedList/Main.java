package LinkedList;

public class Main {
    public static void main(String[] args) {
    LL list = new LL();
    list.insertfirst(3);
        list.insertfirst(4);
        list.insertfirst(5);
        list.insertfirst(6);
        //display the inserted elements
        System.out.println("inserted elements are");
        list.display();

        list.insertend(8);
        //display the elements with the new element inserted at the end
        System.out.println("display after insert element at the end");
        list.display();

        list.insert(50,3);
        System.out.println("display after insert element at specified index");
        list.display();

        list.deletefirst();//delete element at the start
         System.out.println("display after delete element at the start");
        list.display();//display the remaining elements

        list.deletelast();
        System.out.println("display after delete element at the end");
        list.display();

        list.delete(2);
        System.out.println("display after delete element at the given index");
        list.display();
        

    }
}
