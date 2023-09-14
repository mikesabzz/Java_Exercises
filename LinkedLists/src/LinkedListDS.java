import java.util.*;

public class LinkedListDS {

  public List<String> letterCombinations(String digits) {
    LinkedList<String> output_arr = new LinkedList<>();
    output_arr.add("");
    String[] phoneCharacters = {
      "0",
      "1",
      "abc",
      "def",
      "ghi",
      "jkl",
      "mno",
      "pqrs",
      "tuv",
      "wxyz",
    };
    for (int i = 0; i < digits.length(); i++) {
      int index = Character.getNumericValue(digits.charAt(i));
      String phoneChars = phoneCharacters[index];
      while (output_arr.peek().length() == i) {
        String perm = output_arr.remove();
        for (char c : phoneCharacters[index].toCharArray()) {
          output_arr.add(perm + c);
        }
      }
    }
    return output_arr;
  }

  public static void main(String[] args) throws Exception {
    LinkedListDS phonePerm = new LinkedListDS();
    List<String> output_arr = phonePerm.letterCombinations("23");
    System.out.println(output_arr);
  }
}
