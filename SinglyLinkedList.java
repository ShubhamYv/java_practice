public class SinglyLinkedList {
    Node head;
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data= data;
            this.next= null;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next= head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode= head;
        while(currNode != null) {
            currNode= currNode.next;
        }
        currNode.next= newNode;
    }

    public void removeFirst() {
        if(head== null) {
            System.out.println("List is empty...");
            return;
        }
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
        Node currNode = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            currNode = currNode.next;
            lastNode = lastNode.next;
        }
        currNode.next= head;
    }

    public void printList() {
        Node currNode = head;
        while(currNode != null) {
            System.out.println(currNode.data+"->");
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addLast("is");
        list.addLast("a");
        list.addLast("list");
        list.printList();
        list.addFirst("this");
        list.printList();
    }
}
