package linkedlsitUsingGenirics;

class LinkedList<H> {
    public Node<H> head;
    public Node<H> tail;

    public void append(H data) {
        Node<H> node = new Node<>(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.setNext(head);
            head = node;
        }
    }

    public void add(H data) {
        Node<H> newnode = new Node<>(data);
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            tail.setNext(newnode);
            tail = newnode;
        }
    }

    public Node<H> search(H searchData) {
        Node<H> temp = head;
        while (temp != null) {
            if (temp.getData().equals(searchData))
                return temp;
            temp = (Node<H>) temp.getNext();
        }
        return null;
    }

    public boolean searchAndInsert(H searchData, H insertData) {
        Node<H> newNode = new Node(insertData);
        Node<H> searchedNode = search(searchData);
        if (searchedNode == null)
            return false;
        else {
            newNode.setNext(searchedNode.getNext());
            searchedNode.setNext(newNode);
            return true;
        }

    }

    public void popFirst() {
        if (head == null) {
            System.out.println("Linked List is Empty");
        } else {
            H data = head.getData();
            head = (Node<H>) head.getNext();
            System.out.println(data);
        }
    }
    public void popLast() {
        if (head == null) {
            System.out.println("Linked List is Empty");
        } else {
            Node<H> temp = head;
            while (temp.getNext() != tail) {
                temp = (Node<H>) temp.getNext();
            }
            H data = tail.getData();
            temp.setNext(null);
            tail = temp;
            System.out.println(data);
        }
    }
    public void print(){
        if (head==null){
            System.out.println("Linked List is Empty");
        }else {
            Node<H> temp = head;
            while (temp != null) {
                System.out.print(temp.getData()+" ");
                temp = (Node<H>) temp.getNext();
            }
            System.out.println();
        }
    }
    public boolean isEmpty(){
        return head==null ? true:false;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                '}';
    }
}

