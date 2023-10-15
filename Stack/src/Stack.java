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

  public static void main(String[] args) throws Exception {
    Stack<Integer> values = new Stack();
    values.push(30);
    values.push(-5);
    values.push(18);
    values.push(14);
    values.push(-3);
    StackMethod stack = new StackMethod();
    stack.sortStack(values);
  }
}
