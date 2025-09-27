package Lab05;

class DLNode {
    char value;
    DLNode nextNode;
    DLNode prevNode;
    
    DLNode(char value) {
        this.value = value;
        this.nextNode = null;
        this.prevNode = null;
    }
}

class DoublyList {
    DLNode first = null;
    DLNode last = null;

    void add(char value) {
        DLNode newNode = new DLNode(value);
        if(first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.nextNode = newNode;
            newNode.prevNode = last;   // link backward
            last = newNode;
        }
    }

    void addAfter(char searchValue, char newValue) {
         DLNode temp = first;
         while(temp != null) {
            if(temp.value == searchValue) {
                DLNode newNode = new DLNode(newValue);
                newNode.nextNode = temp.nextNode;
                newNode.prevNode = temp; // link backward
                if(temp.nextNode != null) {
                    temp.nextNode.prevNode = newNode; // link backward
                } else {
                    last = newNode; // Update tail if we are inserting at the end
                }
                temp.nextNode = newNode;
                break;
            }
            temp = temp.nextNode;
        }
    }

    void addAtStart(char value){
        DLNode newNode = new DLNode(value);
        if(first == null) {
            newNode.nextNode = first;
            first = newNode;
        }
        else {
            newNode.nextNode = first;
            first.prevNode = newNode;
            first = newNode;
        }
    }

    void find(char value) {
        DLNode temp = first;
        char pos = 0;
        while(temp != null) {
            if(temp.value == value) {
                System.out.println("Item found: " + value + " at index " + pos);
            }
            temp = temp.nextNode;
            pos++;
            if(temp == null) {
                System.out.println("Item "+ value +" not found: ");
            }
        }
    }

    void showForward() {
        DLNode temp = first;
        while(temp != null) {
            System.out.print(temp.value + " <-> ");
            temp = temp.nextNode;
        }
        System.out.println("null");
    }

    void showBackward() {
        DLNode temp = last;
        while(temp != null) {
            System.out.print(temp.value + " <-> ");
            temp = temp.prevNode;
        }
        System.out.println("null");
    }

    void reverseList() {
        DLNode temp = null;
        DLNode current = first;

        while (current != null) {
            temp = current.prevNode;
            current.prevNode = current.nextNode;
            current.nextNode = temp;
            current = current.prevNode;
        }

        if (temp != null) {
            first = temp.prevNode;
        }
    }
}

public class Task0503 {
    public static void main(String[] args) {
        
        DoublyList list = new DoublyList();

        list.add('A');
        list.add('D');
        list.add('F');
        list.add('G');
        list.add('K');
        list.add('L');
        list.add('M');
        list.add('N');
        list.add('S');

        list.showForward();
        list.showBackward();
    } 
}
