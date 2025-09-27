class CharStack {
    char[] stackArray;
    int topIndex;

    CharStack(int capacity) {
        stackArray = new char[capacity];
        topIndex = 0;
    }

    void push(char element) {
        if(topIndex == stackArray.length) {
            System.out.println("Stack Overflow");
            return;
        } else {
            stackArray[topIndex] = element;
            topIndex++;
        }
    }

    char pop() {
        if(topIndex == 0) {
            System.out.println("Stack Underflow");
            return '0';
        } else {
            topIndex--;
            return stackArray[topIndex];
        }
    }

    int getSize() {
        return topIndex;
    }

    boolean isEmpty() {
        if(topIndex == 0) return true;
        return false;
    }

    void showStack() {
        for(int i = topIndex - 1; i >= 0; i--) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
}

public class Task03 {
    public static void main(String[] args) {
        CharStack myStack = new CharStack(6);

        myStack.push('A');
        myStack.push('C');
        myStack.push('D');
        myStack.push('F');
        myStack.push('K');

        myStack.showStack();

        // pop K
        myStack.pop();
        myStack.showStack();

        // pop F
        myStack.pop();
        myStack.showStack();

        // push L
        myStack.push('L');
        myStack.showStack();

        // push P
        myStack.push('P');
        myStack.showStack();

        // pop P
        myStack.pop();
        myStack.showStack();

        // push R
        myStack.push('R');
        myStack.showStack();

        // push S
        myStack.push('S');
        myStack.showStack();

        // pop S
        myStack.pop();
        myStack.showStack();

        System.out.println("Final Stack is: ");
        myStack.showStack();
    }
}
