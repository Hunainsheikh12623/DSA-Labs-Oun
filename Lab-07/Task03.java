class Stack{
    char[] arr;
    int top;

    Stack(int size) {
        arr = new char[size];
        top = 0;
    }

    void push(char c) {
        if(top == arr.length) {
            System.out.println("Stack Overflow");
            return;
        }
        else{
        arr[top] = c;
        top++;
        }
    }

    char pop() {
        if(top == 0) {
            System.out.println("Stack Underflow");
            return '0';
        }
        else{
        top--;
        return arr[top];
        }
    }

    int size() {
        return top;
    }

    boolean isEmpty() {
        if(top == 0) return true;
        return false;
    }

    void printStack() {
        for(int i = top - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}

public class Task03 {
    public static void main(String[] args) {
        Stack stack = new Stack(6);

        stack.push('A');
        stack.push('C');
        stack.push('D');
        stack.push('F');
        stack.push('k');

        stack.printStack();


        // pop K
        stack.pop();
        stack.printStack();

        // pop F
        stack.pop();
        stack.printStack();

        //push L
        stack.push('L');
        stack.printStack();

        //push P
        stack.push('P');
        stack.printStack();

        //pop P
        stack.pop();
        stack.printStack();

        //push R
        stack.push('R');
        stack.printStack();

        //push S
        stack.push('S');
        stack.printStack();

        //pop S
        stack.pop();
        stack.printStack();


        System.out.println("Final Stack is: ");
        stack.printStack();

    }
}
