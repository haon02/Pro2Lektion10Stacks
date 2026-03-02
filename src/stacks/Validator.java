package stacks;

public class Validator {
    public boolean validateBrackets(String expression) {
        StackI stackI = new NodeStack(expression.length());
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stackI.push(c);
            }
            else if (c == ')' || c == ']' || c == '}') {
                if (stackI.isEmpty()) {
                    return false;
                }
                char bracketOpening = (char) stackI.pop();
                if (c == ')' && bracketOpening != '(') return false;
                if (c == ']' && bracketOpening != '[') return false;
                if (c == '}' && bracketOpening != '{') return false;
            }
        }
        return stackI.isEmpty();
    }
}