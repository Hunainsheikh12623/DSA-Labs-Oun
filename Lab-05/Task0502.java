package Lab05;
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

    void treverse() {
            Node current = head;

            System.out.println("");
            System.out.println("Traversing Geo Marks");
            while(current.data != 0) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }

            System.out.println("null");
            current = current.next;

            System.out.println("");

            System.out.println("Traversing Algos Marks");
            while(current.data != 0) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    
    void treverseHighestAlgo() {
        Node current = head;
        while(current.data != 0) {
            current = current.next;
        }
        current = current.next;

        System.out.println("Traversing Algos Marks which are greate then 75");
            while(current.data != 0) {
                if(current.data > 75) {
                System.out.print(current.data + " -> ");
                }
                current = current.next;
            }
            System.out.println("null");
        }



}


public class Task0502 {
    public static void main(String[] args) {
        int Algo = 0;
        int geo = 0;

        linkedList list = new linkedList();
        list.insert(84);
        list.insert(62);
        list.insert(74);
        list.insert(100);
        list.insert(74);
        list.insert(78);
        list.insert(0);
        list.insert(88);
        list.insert(74);
        list.insert(93);
        list.insert(82);
        list.insert(0);

        list.treverse();

        list.treverseHighestAlgo();
        
        

        
        
    } 
    
}
