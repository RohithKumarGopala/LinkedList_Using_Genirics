package linkedlsitUsingGenirics;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("-----Welcome to DataStructure Program-----");
        LinkedList<Integer> list3 = new LinkedList<>();
        list3.add(56);
        list3.add(30);
        list3.add(70);
        list3.print();
        list3.searchAndInsert(30, 40);
        list3.print();
    }
}