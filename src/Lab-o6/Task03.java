class LLNode {
    int value;
    LLNode nextNode;
    
    LLNode(int value) {
        this.value = value;
        this.nextNode = null;
    }
}

class IntLinkedList {
    LLNode first = null;
    LLNode last = null;

    void add(int value) {
        LLNode newNode = new LLNode(value);
        if(first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.nextNode = newNode;
            last = newNode;
        }
    }

    void addAfter(int target, int newValue) {
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

    void addAtStart(int value){
        LLNode newNode = new LLNode(value);
        newNode.nextNode = first;
        first = newNode;
    }

    void addAtEnd(int value) {
        LLNode newNode = new LLNode(value);
        last.nextNode = newNode;
        newNode.nextNode = null;
        last = newNode;
    }

    void find(int value) {
        LLNode currentNode = first;
        int position = 0;
        while(currentNode != null) {
            if(currentNode.value == value) {
                System.out.println("Item found: " + value + " at index " + position);
            }
            currentNode = currentNode.nextNode;
            position++;
            if(currentNode == null) {
                System.out.println("Item "+ value +" not found: ");
            }
        }
    }

    void show() {
        LLNode currentNode = first;
        while(currentNode != null) {
            if(currentNode.value == 0) {
                currentNode = currentNode.nextNode;
            }
            else {
                System.out.print(currentNode.value + " -> ");
                currentNode = currentNode.nextNode;
            }
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

public class Task03 {
    public static void main(String[] args) {
        IntLinkedList list = new IntLinkedList();
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(6);
        list.add(4);
        list.add(1);

        list.show();

        list.addAtStart(10);
        list.show();

        list.addAfter(4, 8);
        list.show();

        list.addAtEnd(9);
        list.show();
    }
}
