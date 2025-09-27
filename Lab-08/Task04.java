import java.util.Scanner;

public class PostfixValidator {

    public static boolean isValidPostfix(String expr) {
        int operandCount = 0;

        for (int i = 0; i < expr.length(); i++) {
            char symbol = expr.charAt(i);

            if (Character.isDigit(symbol) || Character.isLetter(symbol)) {
                operandCount++;
            } 
            else if (symbol == '+' || symbol == '-' || symbol == '*' || symbol == '/') {
                if (operandCount < 2) {
                    return false;
                }
                operandCount--;  // two operands form one result
            } 
            else {
                return false; // invalid character
            }
        }
        return operandCount == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a postfix notation: ");
        String postfixExpr = sc.next();

        System.out.println(isValidPostfix(postfixExpr));
        sc.close();
    }
}
