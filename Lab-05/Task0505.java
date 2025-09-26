package Lab05;
class Node {
    String data;
    Node next;
    
    Node(String data) {
        this.data = data;
        this.next = null;
    }

}

class linkedList {
    Node head = null;
    Node tail = null;

    void insert(String data) {
        Node n = new Node(data);
        if(head == null) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
    }

    void insertAfterKey(String item, String key) {
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

    void insertAtStart(String item){
        Node n = new Node(item);
        n.next = head;
        head = n;
    }

    void search(String item) {
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

    void displayGrades() {
        Node current = head;
        while(current != null) {
            System.out.println("Student " + current.data + " Grade: " + current.next.data);
            current = current.next.next;
        }
    }


}


public class Task0505 {
    public static void main(String[] args) {
        
        linkedList list = new linkedList();
        list.insert("24CS001");
        list.insert("A+");

        list.insert("24CS003");
        list.insert("A");

        list.insert("24CS005");
        list.insert("A+");

        list.insert("24CS007");
        list.insert("B+");
        
        list.insert("24CS009");
        list.insert("A");

        list.insert("24CS011");
        list.insert("A+");
        
        list.insert("24CS013");
        list.insert("B");

        list.insert("24CS015");
        list.insert("A");

        list.insert("24CS017");
        list.insert("A+");

        list.insert("24CS019");
        list.insert("A+");

        list.displayGrades();

    } 
    
}


