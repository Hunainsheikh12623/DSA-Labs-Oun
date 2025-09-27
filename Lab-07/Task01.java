class CharStack {
    char[] elements;
    int pointer;

    CharStack(int capacity) {
        elements = new char[capacity];
        pointer = 0;
    }

    void push(char ch) {
        if(pointer == elements.length) {
            System.out.println("Stack Overflow");
            return;
        } else {
            elements[pointer] = ch;
            pointer++;
        }
    }

    char pop() {
        if(pointer == 0) {
            System.out.println("Stack Underflow");
            return '0';
        } else {
            pointer--;
            return elements[pointer];
        }
    }

    int getSize() {
        return pointer;
    }

    boolean isEmpty() {
        if(pointer == 0) return true;
        return false;
    }

    void showStack() {
        for(int i = pointer - 1; i >= 0; i--) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }
}

public class Task01 {
    public static void main(String[] args) {
        CharStack s = new CharStack(10);
        s.push('A');
        s.push('B');
        s.push('C');

        s.showStack();
        System.out.println(s.pop());
        s.showStack();
    }
}
