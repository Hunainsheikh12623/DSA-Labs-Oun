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


public class Task01 {
    public static void main(String[] args) {

        Stack stack = new Stack(10);
        stack.push('A');
        stack.push('B');
        stack.push('C');


        stack.printStack();
        System.out.println(stack.pop());
        stack.printStack();
        

    }
}