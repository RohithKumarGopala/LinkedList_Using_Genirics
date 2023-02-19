package linkedlsitUsingGenirics;

public class Node <H>{
    private H data;

    public Node(H data) {
        this.data = data;
    }

    private Node <H> next;

    public H getData() {
        return data;
    }

    public void setData(H data) {
        this.data = data;
    }

    public Node<H> getNext() {
        return next;
    }

    public void setNext(Node<H> next) {
        this.next = next;
    }
}


