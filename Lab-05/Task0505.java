package Lab05;

class LLNode {
    String value;
    LLNode nextNode;
    
    LLNode(String value) {
        this.value = value;
        this.nextNode = null;
    }
}

class StudentList {
    LLNode first = null;
    LLNode last = null;

    void add(String value) {
        LLNode newNode = new LLNode(value);
        if(first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.nextNode = newNode;
            last = newNode;
        }
    }

    void addAfter(String target, String newValue) {
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

    void addAtStart(String value){
        LLNode newNode = new LLNode(value);
        newNode.nextNode = first;
        first = newNode;
    }

    void find(String value) {
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

    void showGrades() {
        LLNode currentNode = first;
        while(currentNode != null) {
            System.out.println("Student " + currentNode.value + " Grade: " + currentNode.nextNode.value);
            currentNode = currentNode.nextNode.nextNode;
        }
    }
}

public class Task0505 {
    public static void main(String[] args) {
        
        StudentList list = new StudentList();
        list.add("24CS001");
        list.add("A+");

        list.add("24CS003");
        list.add("A");

        list.add("24CS005");
        list.add("A+");

        list.add("24CS007");
        list.add("B+");
        
        list.add("24CS009");
        list.add("A");

        list.add("24CS011");
        list.add("A+");
        
        list.add("24CS013");
        list.add("B");

        list.add("24CS015");
        list.add("A");

        list.add("24CS017");
        list.add("A+");

        list.add("24CS019");
        list.add("A+");

        list.showGrades();
    } 
}
