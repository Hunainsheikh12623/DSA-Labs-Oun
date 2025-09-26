package Lab05;
class Node {
    char data;
    Node next;
    Node prev;
    
    Node(char data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

}

class doublyLinkedList {
    Node prev = null;
    Node head = null;
    Node tail = null;

    void insert(char data) {
        Node n = new Node(data);
        if(head == null) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            n.prev = tail;   // link backward
            tail = n;
        }
    }

    void insertAfterKey(char item, char key) {
         Node current = head;
         while(current != null) {
            if(current.data == item) {
                Node n = new Node(key);
                n.next = current.next;
                n.prev = current; // link backward
                if(current.next != null) {
                    current.next.prev = n; // link backward
                } else {
                    tail = n; // Update tail if we are inserting at the end
                }
                current.next = n;
                break;
            }
                current = current.next;
        }
    }

    void insertAtStart(char item){
        
        Node n = new Node(item);
        if(head == null) {
            n.next = head;
            head = n;
        }
        else {
            n.next = head;
            head.prev = n;
            head = n;
        }
    }

    void search(char item) {
        Node current = head;
        char index = 0;
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





    void displayForward() {
        Node current = head;
        while(current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    void displayBackward() {
        Node current = tail;
        while(current != null) {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        }
        System.out.println("null");
    }

    void reverse() {
        Node current = head;
        Node temp = null;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        if (temp != null) {
            head = temp.prev;
        }
    }


}


public class Task0503 {
    public static void main(String[] args) {
        
        doublyLinkedList dll = new doublyLinkedList();

        dll.insert('A');
        dll.insert('D');
        dll.insert('F');
        dll.insert('G');
        dll.insert('K');
        dll.insert('L');
        dll.insert('M');
        dll.insert('N');
        dll.insert('S');

        dll.displayForward();
        dll.displayBackward();
        
    } 
    
}
