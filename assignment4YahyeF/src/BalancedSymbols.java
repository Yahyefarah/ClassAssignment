import java.util.Stack;

public class BalancedSymbols {

    public static String isBalanced(String s) {

        // If the string is empty, it is balanced
        if (s.isEmpty()) {
            return "YES";
        }
       // char symbol;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char symbol = s.charAt(i);

            if (symbol == '(' || symbol == '[' || symbol == '{' || symbol == '<' || symbol == '¿') {
                stack.push(symbol);
            }

            else if (symbol == ')' || symbol == ']' || symbol == '}' || symbol == '>' || symbol == '?') {

                if (stack.isEmpty()) {
                    return "NO";
                }

                // Store the top opening symbol in a temporary variable
                char temp = stack.peek();

                // Check if the closing symbol matches the opening symbol on top of the stack
                if ((symbol == ')' && temp == '(') ||
                        (symbol == ']' && temp == '[') ||
                        (symbol == '}' && temp == '{') ||
                        (symbol == '>' && temp == '<') ||
                        (symbol == '?' && temp == '¿')) {

                    // If they match, remove the opening symbol from the stack
                    stack.pop();
                } else {
                    return "NO";
                }
            }
        }

        // If the stack is empty at the end, everything matched
        if (stack.isEmpty()) {
            return "YES";
        }

        return "NO";
    }

    public static void main(String[] args) {
        String s1 = "{[()]}";
        String s2 = "{[(])}";
        String s3 = "{{[[(()<>)]]}}";

        System.out.println("Sample Input: " + s1 + " -> " + isBalanced(s1));
        System.out.println("Sample Input: " + s2 + " -> " + isBalanced(s2));
        System.out.println("Sample Input: " + s3 + " -> " + isBalanced(s3));
    }
}
