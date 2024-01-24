package LinkedList;

public class DllMain {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertbegin(3);
        list.insertbegin(4);
        list.insertbegin(5);
        list.insertbegin(6);
        System.out.println("elements inserted at the start of the double linked list");
        list.display();
        System.out.println();
        System.out.println();

        list.insertend(2);
        System.out.println("elements inserted at the end of the double linked list");
        list.display();
        System.out.println();
        System.out.println();


        list.insert(8,3);
        System.out.println("elements inserted in of the double linked list");
        list.display();
        System.out.println();
        System.out.println();

        list.deletebegin();
        System.out.println("deleted element from the start of the double linked list");
        list.display();
        System.out.println();
        System.out.println();

        list.deleteend();
        System.out.println("deleted element from the end of the double linked list");
        list.display();
        System.out.println();
        System.out.println();


    }
}
