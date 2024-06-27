import java.util.Stack;

public class isPalndrome {

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '{' || ch == '(' || ch == '[') {
                stack.push(ch);
            } else if (ch == '}' || ch == ')' || ch == ']') {
                if (stack.isEmpty()) {
                    return false; // No matching opening parenthesis found
                }

                char open = stack.pop();
                if ((ch == '}' && open != '{') ||
                    (ch == ')' && open != '(') ||
                    (ch == ']' && open != '[')) {
                    return false; // Mismatched opening and closing parenthesis
                }
            }
        }
      



        return stack.isEmpty(); // Stack should be empty if all parentheses are balanced
    }

    public static void main(String[] args) {
        String s = "{(}";

        if (isBalanced(s)) {
            System.out.println(s + " is a balanced expression.");
        } else {
            System.out.println(s + " is not a balanced expression.");
        }
    }
}
