import java.util.*;

public class InfixToPostfix {

    // function to return precedence of operators
    public static int precedence(char operator) {
        if (operator == '+' || operator == '-') {
            return 1;
        }
        if (operator == '*' || operator == '/') {
            return 2;
        }
        return 0;
    }

    // function to convert infix to postfix
    public static String infixToPostfix(String expression) {
        Stack<Character> operatorStack = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        for (int i = 0; i < expression.length(); i++) {
            char token = expression.charAt(i);

            if (Character.isLetterOrDigit(token)) {  // operand
                postfix.append(token);
            } 
            else if (token == '(') {
                operatorStack.push(token);
            } 
            else if (token == ')') {
                while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                    postfix.append(operatorStack.pop());
                }
                operatorStack.pop(); // remove '('
            } 
            else { // operator
                while (!operatorStack.isEmpty() && precedence(operatorStack.peek()) >= precedence(token)) {
                    postfix.append(operatorStack.pop());
                }
                operatorStack.push(token);
            }
        }

        while (!operatorStack.isEmpty()) {
            postfix.append(operatorStack.pop());
        }

        return postfix.toString();
    }

    public static void main(String[] args) {
        String inputExpr = "(A+B)*C";
        System.out.println("Postfix: " + infixToPostfix(inputExpr));
    }
}
