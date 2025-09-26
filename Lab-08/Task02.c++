#include<iostream>
#include<cctype>
using namespace std;

class Stack{

    int num;
    int top;
    int* arr;

    public:
    
    Stack(int n) {
        num = n;
        top = 0;
        arr = new int[num];
    }

    void push(int n) {
        if(isFull()) {
            cout << "OverFlow" << endl ;
        }
        else{
        arr[top] = n;
        top++;
        }
    }

    int pop() {
        if(isEmpty()) {
            cout << "UnderFlow" << endl;
            return '0';
        }
        else{
        top--;
        return arr[top];
        }
    }

    bool isEmpty() {
        return (top == 0);
    }

    bool isFull() {
        return (top == num);
    }
    

};

int main() {

    string s;
    cout << "Enter a reverse prefix(postfix) Notation: " << endl;
    cin >> s;

    Stack stack(s.length());

    for (int i = 0; i < s.length(); i++) {
        char c = s[i];

        if (isdigit(c)) {
            stack.push(c - '0');
        } else {
            int operand2 = stack.pop();
            int operand1 = stack.pop();
            int result;

            switch (c) {
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
            stack.push(result);
        }
    }

    cout << "Result = " << stack.pop() << endl;
    return 0;
}

