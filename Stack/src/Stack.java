import java.util.*;

public class StackMethod {

  public void sortStack(Stack<Integer> value) {
    Stack<Integer> newStack = new Stack();
    while (!value.isEmpty()) {
      int temp = value.pop();
      while (!newStack.isEmpty() && newStack.peek() > temp) {
        value.push(newStack.pop());
      }
      newStack.push(temp);
    }
    while (!newStack.isEmpty()) {
      value.push(newStack.pop());
    }
    System.out.println(newStack);
  }

  public boolean isValid(String s) {
    Stack<Character> stack = new Stack();
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == ')' && stack.peek() == '(') {
        stack.pop();
      } else if (s.charAt(i) == '}' && stack.peek() == '{') {
        stack.pop();
      } else if (s.charAt(i) == ']' && stack.peek() == '[') {
        stack.pop();
      } else {
        stack.add(s.charAt(i));
      }
    }
    return stack.isEmpty();
  }

  public int evalRPN(String[] tokens) {
    Stack<Integer> stack = new Stack();
    for (String c : tokens) {
      if (c.equals("+")) {
        int a1 = stack.pop();
        int a2 = stack.pop();
        stack.push(a2 + a1);
      } else if (c.equals("-")) {
        int a1 = stack.pop();
        int a2 = stack.pop();
        stack.push(a2 - a1);
      } else if (c.equals("*")) {
        int a1 = stack.pop();
        int a2 = stack.pop();
        stack.push(a2 * a1);
      } else if (c.equals("/")) {
        int a1 = stack.pop();
        int a2 = stack.pop();
        stack.push(a2 / a1);
      } else {
        stack.push(Integer.parseInt(c));
      }
    }
    return stack.peek();
  }

  public static void main(String[] args) throws Exception {
    Stack<Integer> values = new Stack();
    values.push(30);
    values.push(-5);
    values.push(18);
    values.push(14);
    values.push(-3);
    StackMethod stack = new StackMethod();
    // stack.sortStack(values);
    boolean isVal = stack.isValid("({[})");
    // System.out.println(isVal);
    String[] tokens = { "4", "13", "5", "/", "+" };
    int ans = stack.evalRPN(tokens);
    System.out.println(ans);
  }
}
