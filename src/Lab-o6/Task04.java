class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }

}

class linkedList {
    Node head = null;
    Node tail = null;

    void insert(int data) {
        Node n = new Node(data);
        if(head == null) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
    }

    void insertAfterKey(int item, int key) {
         Node current = head;
         while(current != null) {
            if(current.data == item) {
                Node n = new Node(key);
                n.next = current.next;
                current.next = n;
            }
                current = current.next;
            }
    }

    void insertAtStart(int item){
        Node n = new Node(item);
        n.next = head;
        head = n;
    }

    void insertAtLast(int item) {
        Node n = new Node(item);
        tail.next = n;
        n.next = null;
    }

    void search(int item) {
        Node current = head;
        int index = 0;
        while(current != null) {
            if(current.data == item) {
                System.out.println("Item found: " + item + " at index " + index);
            }
            current = current.next;
            index++;
            if(current == null) {
                System.out.println("Item "+ item +" not found: ");
            }
        }
    }

    void display() {
        Node current = head;
        while(current != null) {
            if(current.data == 0) {
                current = current.next;
            }
            else{
            System.out.print(current.data + " -> ");
            current = current.next;
            }
            
        }
        System.out.println("null");
    }

    void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        tail = head; // Update tail to the original head
        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev; // Update head to the new front of the list
    }

    void removeFirstNode() {
        if(head == null) {
            System.out.println("Underflow");
        }
        else{
            head = head.next;
        }
    }
    void removeLastNode() {
        if (head == null) {
            System.out.println("Underflow");
            return;
        }
        if (head == tail) { 
            head = null;
            tail = null;
            return;
        }
        Node current = head;
        while (current.next != tail) {
            current = current.next;
        }

        current.next = null; 
        tail = current;      
    }
}

public class Task04{
    public static void main(String[] args) {
        linkedList l = new linkedList();
        l.insert(1);
        l.insert(4);
        l.insert(2);
        l.insert(11);
        l.insert(5);
        l.insert(6);
        l.insert(7);
        l.insert(9);
        l.insert(15);

        l.display();
        l.removeFirstNode();
        l.display();
        l.removeLastNode();
        l.display();
    }
}

