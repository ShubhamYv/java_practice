public class LL {
    Node head;
    int size = 0;
    LL() {
        size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data= data;
            this.next= null;
            size++;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node lastNode = head;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    public void removeFirst() {
        if(head== null) {
            System.out.println("List is empty...");
            return;
        }
        size--;
        head= head.next;
    }

    public void removeLast() {
        if(head== null) {
            System.out.println("List is empty...");
            return;
        }
        if (head.next== null) {
            head= null;
            return;
        }
        size--;
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next= head;
    }

    public int getSize() {
        return size;
    }


    public void printList() {
        Node currNode = head;
        while (currNode.next != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }


    public static void main(String args[]) {
        LL list = new LL();
        list.addLast("is");
        list.addLast("a");
        list.addLast("list");
        list.printList();
        list.addFirst("this");
        list.printList();
        System.out.println(list.getSize());
        list.removeFirst();
        list.printList();
        list.removeLast();
        list.printList();
    }
}
