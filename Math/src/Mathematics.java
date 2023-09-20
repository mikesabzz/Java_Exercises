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
    if (n == 1 || n == -1) {
      return true;
    }
    Set<Integer> set = new HashSet<Integer>();
    while (!set.contains(n)) {
      set.add(n);
      n = sumOfSquares(n);
      if (n == 1) {
        return true;
      }
    }
    return false;
  }

  public int sumOfSquares(int n) {
    int result = 0;
    while (n != 0) {
      int digit = n % 10;
      digit = digit * digit;
      result += digit;
      n = n / 10;
    }
    return result;
  }

  public static void main(String[] args) throws Exception {
    Mathematics mathematics = new Mathematics();
    int[] digits = { 1, 2, 3 };
    int[] plus = mathematics.plusOne(digits);
    // for (int j : plus) {
    //   System.out.println(j);
    // }
    System.out.println(mathematics.isHappy(2));
  }
}
