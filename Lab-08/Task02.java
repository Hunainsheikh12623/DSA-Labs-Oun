import java.util.Scanner;

class IntStack {
    private int capacity;
    private int topIndex;
    private int[] stackArray;

    public IntStack(int size) {
        capacity = size;
        topIndex = 0;
        stackArray = new int[capacity];
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("OverFlow");
        } else {
            stackArray[topIndex] = value;
            topIndex++;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("UnderFlow");
            return 0; // same as '0' in C++
        } else {
            topIndex--;
            return stackArray[topIndex];
        }
    }

    public boolean isEmpty() {
        return (topIndex == 0);
    }

    public boolean isFull() {
        return (topIndex == capacity);
    }
}

public class PostfixEvaluation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a reverse prefix (postfix) Notation: ");
        String expression = sc.next();

        IntStack evalStack = new IntStack(expression.length());

        for (int i = 0; i < expression.length(); i++) {
            char symbol = expression.charAt(i);

            if (Character.isDigit(symbol)) {
                evalStack.push(symbol - '0');
            } else {
                int operand2 = evalStack.pop();
                int operand1 = evalStack.pop();
                int result;

                switch (symbol) {
                    case '+':
                        result = operand1 + operand2;
                        break;
                    case '-':
                        result = operand1 - operand2;
                        break;
                    case '*':
                        result = operand1 * operand2;
                        break;
                    case '/':
                        if (operand2 == 0) {
                            System.out.println("Undefined (division by zero)");
                            return;
                        }
                        result = operand1 / operand2;
                        break;
                    default:
                        System.out.println("Invalid operator!");
                        return;
                }
                evalStack.push(result);
            }
        }

        System.out.println("Result = " + evalStack.pop());
        sc.close();
    }
}
