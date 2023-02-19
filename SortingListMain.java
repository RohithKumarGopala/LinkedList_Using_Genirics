package linkedlsitUsingGenirics;

public class SortingListMain {
    public static void main(String[] args) {
        System.out.println("-----Welcome to DataStructure Program-----");
        SortingListMain sortList = new SortingListMain();


        sortList.addTheNode(56);
        sortList.addTheNode(30);
        sortList.addTheNode(40);
        sortList.addTheNode(70);

        System.out.println("Original list: ");
        sortList.display();

        sortList.sortInTheList();

        System.out.println("Sorted list: ");
        sortList.display();
}
}

