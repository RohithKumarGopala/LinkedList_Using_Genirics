package linkedlsitUsingGenirics;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("-----Welcome to DataStructure Program-----");
        LinkedList<Integer> list=new LinkedList();
        list.add(70);
        list.add(30);
        list.add(56);
        list.print();

        LinkedList<Integer>list1=new LinkedList<>();
        list1.add(56);
        list1.add(30);
        list1.add(70);
        list1.print();

        LinkedList<Integer>list2=new LinkedList<>();
        list2.add(56);
        list2.add(70);
        list2.searchAndInsert(56,30);
        list2.print();
        list2.popFirst();
        list2.print();
        list2.popLast();
        list2.print();
    }
}