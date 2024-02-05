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
    for (char c : s.toCharArray()) {
      if (c == '(') {
        stack.push(')');
      } else if (c == '[') {
        stack.push(']');
      } else if (c == '{') {
        stack.push('}');
      } else if (stack.isEmpty() || stack.pop() != c) {
        return false;
      }
    }
    return stack.isEmpty();
    // for (int i = 0; i < s.length(); i++) {
    //     if (s.charAt(i) == ')' && stack.peek() == '(') {
    //       stack.pop();
    //     } else if (s.charAt(i) == '}' && stack.peek() == '{') {
    //       stack.pop();
    //     } else if (s.charAt(i) == ']' && stack.peek() == '[') {
    //       stack.pop();
    //     } else {
    //       stack.add(s.charAt(i));
    //     }
    //   }
    //   return stack.isEmpty();
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

  public List<String> generateParenthesis(int n) {
    List<String> list = new ArrayList();
    generateValue(list, 0, 0, n, "");
    return list;
  }

  public void generateValue(
    List<String> list,
    int open,
    int close,
    int n,
    String str
  ) {
    if (str.length() == 2 * n) {
      list.add(str);
      return;
    }
    if (open < n) {
      generateValue(list, open + 1, close, n, str + "(");
    }
    if (close < open) {
      generateValue(list, open, close + 1, n, str + ")");
    }
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
    boolean isVal = stack.isValid("(]");
    // System.out.println("This Paranthesis is valid: " + isVal);
    String[] tokens = {
      "10",
      "6",
      "9",
      "3",
      "+",
      "-11",
      "*",
      "/",
      "*",
      "17",
      "+",
      "5",
      "+",
    };
    int ans = stack.evalRPN(tokens);
    // System.out.println("The eval of rpn is " + ans);
    List<String> testing = stack.generateParenthesis(3);
    System.out.println(testing);
  }
}
