#include<iostream>
#include<cctype>
using namespace std;

class IntStack {

    int capacity;
    int topIndex;
    int* stackArray;

    public:
    
    IntStack(int size) {
        capacity = size;
        topIndex = 0;
        stackArray = new int[capacity];
    }

    void push(int value) {
        if(isFull()) {
            cout << "OverFlow" << endl ;
        }
        else{
            stackArray[topIndex] = value;
            topIndex++;
        }
    }

    int pop() {
        if(isEmpty()) {
            cout << "UnderFlow" << endl;
            return '0';
        }
        else{
            topIndex--;
            return stackArray[topIndex];
        }
    }

    bool isEmpty() {
        return (topIndex == 0);
    }

    bool isFull() {
        return (topIndex == capacity);
    }
};

int main() {

    string expression;
    cout << "Enter a prefix (Polish) Notation: " << endl;
    cin >> expression;

    IntStack evalStack(expression.length());

    for (int i = expression.length() - 1; i >= 0; i--) {
        char symbol = expression[i];

        if (isdigit(symbol)) {
            evalStack.push(symbol - '0');
        }
        else {
            int operand1 = evalStack.pop();
            int operand2 = evalStack.pop();
            int result;

            switch (symbol) {
                case '+': result = operand1 + operand2; break;
                case '-': result = operand1 - operand2; break;
                case '*': result = operand1 * operand2; break;
                case '/': 
                    if (operand2 == 0) {
                        cout << "Undefined (division by zero)" << endl;
                        return 0;
                    }
                    result = operand1 / operand2; 
                    break;
                default: 
                    cout << "Invalid operator!" << endl; 
                    return 0;
            }
            evalStack.push(result);
        }
    }

    cout << "Result = " << evalStack.pop() << endl;

    return 0;
}
