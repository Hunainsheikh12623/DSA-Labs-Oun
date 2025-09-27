package Lab05;

class LLNode {
    char value;
    LLNode nextNode;
    
    LLNode(char value) {
        this.value = value;
        this.nextNode = null;
    }
}

class SimpleLinkedList {
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
        char position = 0;
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

    void moveFirstToEnd() {
        if(first == null || first.nextNode == null) {
            return;
        }
        else{
            LLNode temp = first;
            first = first.nextNode;
            last.nextNode = temp;
            temp.nextNode = null;
            last = temp;
        }
    }
}

public class Task0504 {
    public static void main(String[] args) {
        
        SimpleLinkedList list = new SimpleLinkedList();
        list.add('C');
        list.add('E');
        list.add('A');
        list.add('B');
        list.add('F');
        list.add('D');

        System.out.println("Original List:");
        list.show();

        System.out.println("List after Delete First Node and Add it at the End: ");
        list.moveFirstToEnd();

        list.show();
    } 
}
