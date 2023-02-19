package linkedlsitUsingGenirics;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("-----Welcome to DataStructure Program-----");
        LinkedList list = new LinkedList();

        list.append(70);
        list.append(40);
        list.append(30);
        list.append(56);


        System.out.println("\nThe Created Linked list is: ");
        list.printtheList();

        list.deletetheNode(2);

        System.out.println(
                "\nThe Linked List after Deletion at position 3 is: ");
        list.printtheList();

    }
}