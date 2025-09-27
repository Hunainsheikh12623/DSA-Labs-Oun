class Element {
    int value;
    Element link;
    
    Element(int value) {
        this.value = value;
        this.link = null;
    }
}

class CustomList {
    Element first = null;
    Element last = null;

    void add(int value) {
        Element node = new Element(value);
        if(first == null) {
            first = node;
            last = node;
        } else {
            last.link = node;
            last = node;
        }
    }

    void addAfterKey(int searchVal, int newVal) {
        Element pointer = first;
        while(pointer != null) {
            if(pointer.value == searchVal) {
                Element node = new Element(newVal);
                node.link = pointer.link;
                pointer.link = node;
            }
            pointer = pointer.link;
        }
    }

    void addAtStart(int newVal){
        Element node = new Element(newVal);
        node.link = first;
        first = node;
    }

    void find(int searchVal) {
        Element pointer = first;
        int idx = 0;
        while(pointer != null) {
            if(pointer.value == searchVal) {
                System.out.println("Item found: " + searchVal + " at index " + idx);
            }
            pointer = pointer.link;
            idx++;
            if(pointer == null) {
                System.out.println("Item "+ searchVal +" not found: ");
            }
        }
    }

    void show() {
        Element pointer = first;
        while(pointer != null) {
            System.out.print(pointer.value + " -> ");
            pointer = pointer.link;
        }
        System.out.println("null");
    }

    void reverseList() {
        Element prevNode = null;
        Element pointer = first;
        Element nextNode = null;
        last = first; // Update last to the original first
        while(pointer != null) {
            nextNode = pointer.link;
            pointer.link = prevNode;
            prevNode = pointer;
            pointer = nextNode;
        }
        first = prevNode; // Update first to the new head
    }

    void traverse() {
        Element pointer = first;
        System.out.println("Traversing Geo Marks");
        while(pointer.value != 0) {
            System.out.print(pointer.value + " -> ");
            pointer = pointer.link;
        }
        System.out.println("null");
        pointer = pointer.link;
        System.out.println("");
        System.out.println("Traversing Algos Marks");
        while(pointer.value != 0) {
            System.out.print(pointer.value + " -> ");
            pointer = pointer.link;
        }
        System.out.println("null");
    }
}

public class Task0501{
    public static void main(String[] args) {
        int algoMarks = 0;
        int geoMarks = 0;

        CustomList marksList = new CustomList();
        marksList.add(84);
        marksList.add(62);
        marksList.add(74);
        marksList.add(100);
        marksList.add(74);
        marksList.add(78);
        marksList.add(0);
        marksList.add(88);
        marksList.add(74);
        marksList.add(93);
        marksList.add(82);
        marksList.add(0);

        marksList.traverse();
    } 
}
