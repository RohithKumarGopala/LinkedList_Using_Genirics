package linkedlsitUsingGenirics;

public class SimpleLinkedlist<T> {
    public Node<T> head;
    public Node<T> tail;

    public void push(T data) {
        Node<T> node = new Node<>();
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.setNext(head);
            head = node;
        }
    }
    }


