package Lab05;

class Element {
    int value;
    Element nextNode;
    
    Element(int value) {
        this.value = value;
        this.nextNode = null;
    }
}

class CustomLinkedList {
    Element first = null;
    Element last = null;

    void add(int value) {
        Element node = new Element(value);
        if(first == null) {
            first = node;
            last = node;
        } else {
            last.nextNode = node;
            last = node;
        }
    }

    void addAfterKey(int searchVal, int newVal) {
        Element current = first;
        while(current != null) {
            if(current.value == searchVal) {
                Element node = new Element(newVal);
                node.nextNode = current.nextNode;
                current.nextNode = node;
            }
            current = current.nextNode;
        }
    }

    void addAtStart(int newVal){
        Element node = new Element(newVal);
        node.nextNode = first;
        first = node;
    }

    void find(int searchVal) {
        Element current = first;
        int pos = 0;
        while(current != null) {
            if(current.value == searchVal) {
                System.out.println("Item found: " + searchVal + " at index " + pos);
            }
            current = current.nextNode;
            pos++;
            if(current == null) {
                System.out.println("Item "+ searchVal +" not found: ");
            }
        }
    }

    void show() {
        Element current = first;
        while(current != null) {
            System.out.print(current.value + " -> ");
            current = current.nextNode;
        }
        System.out.println("null");
    }

    void reverseList() {
        Element prev = null;
        Element current = first;
        Element nxt = null;
        last = first; // Update last to the original first
        while(current != null) {
            nxt = current.nextNode;
            current.nextNode = prev;
            prev = current;
            current = nxt;
        }
        first = prev; // Update first to the new head
    }

    void traverse() {
        Element current = first;

        System.out.println("");
        System.out.println("Traversing Geo Marks");
        while(current.value != 0) {
            System.out.print(current.value + " -> ");
            current = current.nextNode;
        }

        System.out.println("null");
        current = current.nextNode;

        System.out.println("");
        System.out.println("Traversing Algos Marks");
        while(current.value != 0) {
            System.out.print(current.value + " -> ");
            current = current.nextNode;
        }
        System.out.println("null");
    }
    
    void traverseHighestAlgo() {
        Element current = first;
        while(current.value != 0) {
            current = current.nextNode;
        }
        current = current.nextNode;

        System.out.println("Traversing Algos Marks which are greater than 75");
        while(current.value != 0) {
            if(current.value > 75) {
                System.out.print(current.value + " -> ");
            }
            current = current.nextNode;
        }
        System.out.println("null");
    }
}

public class Task0502{
    public static void main(String[] args) {
        int algoMarks = 0;
        int geoMarks = 0;

        CustomLinkedList marks = new CustomLinkedList();
        marks.add(84);
        marks.add(62);
        marks.add(74);
        marks.add(100);
        marks.add(74);
        marks.add(78);
        marks.add(0);
        marks.add(88);
        marks.add(74);
        marks.add(93);
        marks.add(82);
        marks.add(0);

        marks.traverse();
        marks.traverseHighestAlgo();
    } 
}
