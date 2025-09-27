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
        if(head == null) {class LLNode {
    char value;
    LLNode nextNode;
    
    LLNode(char value) {
        this.value = value;
        this.nextNode = null;
    }
}

class CharLinkedList {
    LLNode first = null;
    LLNode last = null;

    void add(char value) {
        LLNode newNode = new LLNode(value);
        if(first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.nextNode = newNode;
            last = newNode;
        }
    }

    void addAfter(char target, char newValue) {
        LLNode currentNode = first;
        while(currentNode != null) {
            if(currentNode.value == target) {
                LLNode newNode = new LLNode(newValue);
                newNode.nextNode = currentNode.nextNode;
                currentNode.nextNode = newNode;
            }
            currentNode = currentNode.nextNode;
        }
    }

    void addAtStart(char value){
        LLNode newNode = new LLNode(value);
        newNode.nextNode = first;
        first = newNode;
    }

    void find(char value) {
        LLNode currentNode = first;
        char pos = 0;
        while(currentNode != null) {
            if(currentNode.value == value) {
                System.out.println("Item found: " + value + " at index " + pos);
            }
            currentNode = currentNode.nextNode;
            pos++;
            if(currentNode == null) {
                System.out.println("Item "+ value +" not found: ");
            }
        }
    }

    void show() {
        LLNode currentNode = first;
        while(currentNode != null) {
            System.out.print(currentNode.value + " -> ");
            currentNode = currentNode.nextNode;
        }
        System.out.println("null");
    }

    void reverseList() {
        LLNode prevNode = null;
        LLNode currentNode = first;
        LLNode nextNode = null;
        last = first; // Update last to the original first
        while(currentNode != null) {
            nextNode = currentNode.nextNode;
            currentNode.nextNode = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        first = prevNode; // Update first to the new front
    }
}

public class Task01 {
    public static void main(String[] args) {
        CharLinkedList list = new CharLinkedList();
        list.add('F');
        list.add('D');
        list.add('A');

        list.show();

        list.addAfter('D', 'E');
        list.show();

        list.addAtStart('B');
        list.show();
    }
}

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
}

public class Task01{
    public static void main(String[] args) {
        linkedList l = new linkedList();
        l.insert('F');
        l.insert('D');
        l.insert('A');

        l.display();

        l.insertAfterKey('D', 'E');
        l.display();

        l.insertAtStart('B');
        l.display();
    }
}
