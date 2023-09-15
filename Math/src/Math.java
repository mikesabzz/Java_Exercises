import java.util.*;

public class Math {

  public int[] plusOne(int[] digits) {
    List<Integer> finalList = new ArrayList<Integer>();
    String s = "";
    for (int i : digits) {
      s += i;
    }
    int secDigits = Integer.parseInt(s) + 1;
    String secDigitsStr = Integer.toString(secDigits);
    char[] digitC = secDigitsStr.toCharArray();
    int[] intArray = new int[digitC.length];
    for (int i = 0; i < digitC.length; i++) {
      intArray[i] = Character.getNumericValue(digitC[i]);
    }

    return intArray;
  }

  public static void main(String[] args) throws Exception {
    Math math = new Math();
    int[] digits = { 1, 2, 3 };
    int[] plus = math.plusOne(digits);
    for (int j : plus) {
      System.out.println(j);
    }
  }
}
