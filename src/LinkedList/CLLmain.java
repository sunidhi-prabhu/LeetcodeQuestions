package LinkedList;

public class CLLmain {
    public static void main(String[] args) {
    CLL list = new CLL();

   list.insert(23);
   list.insert(3);
   list.insert(19);
   list.insert(75);
   System.out.println("elements of CLL are\t");
   list.display();
   System.out.println();

   list.delete(3);
   System.out.println("elements of CLL after deletion are\t");
    list.display();

    }
}
