package linkedlsitUsingGenirics;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("-----Welcome to DataStructure Program-----");
        LinkedList list = new LinkedList();

        list.insertInTheNode(56);
        list.insertInTheNode(30);
        list.insertInTheNode(70);


        list.searchInTheNode(30);
    }
}