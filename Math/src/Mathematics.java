import java.lang.Math;
import java.util.*;

public class Mathematics {

  public int[] plusOne(int[] digits) {
    int len = digits.length;
    for (int i = len - 1; i >= 0; i--) {
      if (digits[i] < 9) {
        digits[i]++;
        return digits;
      }
      digits[i] = 0;
    }
    int[] intArray = new int[len + 1];
    intArray[0] = 1;
    return intArray;
  }

  public boolean isHappy(int n) {
    int result = 0;
    while (n != 0) {
      int digits = n % 10;
      digits = digits * digits;
      result += digits;
      n = n / 10;
    }
    System.out.println(result);
    return false;
  }

  public static void main(String[] args) throws Exception {
    Mathematics mathematics = new Mathematics();
    int[] digits = { 1, 2, 3 };
    int[] plus = mathematics.plusOne(digits);
    // for (int j : plus) {
    //   System.out.println(j);
    // }
    System.out.println(mathematics.isHappy(19));
  }
}
