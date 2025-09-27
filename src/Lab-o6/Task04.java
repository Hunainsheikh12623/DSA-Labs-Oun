class Element {
    int value;
    Element link;
    
    Element(int value) {
        this.value = value;
        this.link = null;
    }
}

class CustomList {
    Element start = null;
    Element end = null;

    void add(int value) {
        Element temp = new Element(value);
        if(start == null) {
            start = temp;
            end = temp;
        } else {
            end.link = temp;
            end = temp;
        }
    }

    void addAfterKey(int target, int newValue) {
        Element ptr = start;
        while(ptr != null) {
            if(ptr.value == target) {
                Element temp = new Element(newValue);
                temp.link = ptr.link;
                ptr.link = temp;
            }
            ptr = ptr.link;
        }
    }

    void addAtStart(int value){
        Element temp = new Element(value);
        temp.link = start;
        start = temp;
    }

    void addAtLast(int value) {
        Element temp = new Element(value);
        end.link = temp;
        temp.link = null;
    }

    void search(int key) {
        Element ptr = start;
        int pos = 0;
        while(ptr != null) {
            if(ptr.value == key) {
                System.out.println("Item found: " + key + " at index " + pos);
            }
            ptr = ptr.link;
            pos++;
            if(ptr == null) {
                System.out.println("Item " + key + " not found: ");
            }
        }
    }

    void show() {
        Element ptr = start;
        while(ptr != null) {
            if(ptr.value == 0) {
                ptr = ptr.link;
            }
            else{
                System.out.print(ptr.value + " -> ");
                ptr = ptr.link;
            }
        }
        System.out.println("null");
    }

    void reverse() {
        Element prev = null;
        Element curr = start;
        Element nxt = null;
        end = start; 
        while(curr != null) {
            nxt = curr.link;
            curr.link = prev;
            prev = curr;
            curr = nxt;
        }
        start = prev;
    }

    void removeFirst() {
        if(start == null) {
            System.out.println("Underflow");
        }
        else{
            start = start.link;
        }
    }
    void removeLast() {
        if (start == null) {
            System.out.println("Underflow");
            return;
        }
        if (start == end) { 
            start = null;
            end = null;
            return;
        }
        Element ptr = start;
        while (ptr.link != end) {
            ptr = ptr.link;
        }

        ptr.link = null; 
        end = ptr;      
    }
}

public class Task04 {
    public static void main(String[] args) {
        CustomList list = new CustomList();
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(11);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(9);
        list.add(15);

        list.show();
        list.removeFirst();
        list.show();
        list.removeLast();
        list.show();
    }
}
