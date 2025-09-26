package Lab05;
class Node {
    char data;
    Node next;
    
    Node(char data) {
        this.data = data;
        this.next = null;
    }

}

class linkedList {
    Node head = null;
    Node tail = null;

    void insert(char data) {
        Node n = new Node(data);
        if(head == null) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
    }

    void insertAfterKey(char item, char key) {
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

    void insertAtStart(char item){
        Node n = new Node(item);
        n.next = head;
        head = n;
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





    void display() {
        Node current = head;
        while(current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
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

    void deleteStartAddAtEnd() {
        if(head == null || head.next == null) {
            return;
        }
        else{
            Node temp = head;
            head = head.next;
            tail.next = temp;
            temp.next = null;
            tail = temp;
        }
    }


}


public class Task0504 {
    public static void main(String[] args) {
        
        linkedList list = new linkedList();
        list.insert('C');
        list.insert('E');
        list.insert('A');
        list.insert('B');
        list.insert('F');
        list.insert('D');

        System.out.println("Original List:");
        list.display();

        System.out.println("List after Delete First Node and Add it at the End: ");
        list.deleteStartAddAtEnd();

        list.display();
    } 
    
}


