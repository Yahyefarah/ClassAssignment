import java.util.Stack;

public class InfixToPostfix {
// This method converts an infix expression to postfix
    public static String convert(String s) {

        Stack<Character> stack = new Stack<>();
        String output = "";

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            //  If the character is a letter or number
            // I  add it directly to the output

            if ( (c >= 'a' && c <= 'z') ||
                    (c >= 'A' && c <= 'Z') ||
                    (c >= '0' && c <= '9')){

                output = output + c;
            }

            else if (c == '(') {
                stack.push(c);
            }


            else if (c == ')') {

                while (stack.peek() != '(') {
                    output += stack.pop();
                }

                stack.pop();
            }


            else {

                while (!stack.isEmpty() &&
                        precedence(stack.peek()) >= precedence(c)) {

                    output += stack.pop();
                }

                stack.push(c);
            }
        }

        // After scanning the whole expression,
        // pop any remaining operators
        while (!stack.isEmpty()) {
            output += stack.pop();
        }

        return output;
    }

    // This method  shows me which operator has higher priority
    public static int precedence(char opr) {

        if (opr == '^'){ return 3;}
        if (opr == '*' || opr == '/') {return 2;}
        if (opr == '+' || opr == '-') {return 1;}

        return 0;
    }

    public static void main(String[] args) {

        String ex = "a+b*(c^d-e)^(f+g*h)-i";

        System.out.println("Input: " + ex);
        System.out.println("Postfix: " + convert(ex));
    }
}