import java.util.*;

public class Two_Pointers {

  public boolean isPalindrome(String s) {
    s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    int left = 0;
    int right = s.length() - 1;
    while (left < right) {
      if (s.charAt(left) == s.charAt(right)) {
        left++;
        right--;
      }
      return false;
    }
    return true;
  }

  public int[] twoSum(int[] numbers, int target) {
    int left = 0;
    int right = numbers.length - 1;
    while (left < right) {
      if (numbers[left] + numbers[right] > target) {
        right--;
      } else if (numbers[left] + numbers[right] < target) {
        left++;
      } else {
        return new int[] { left + 1, right + 1 };
      }
    }
    return new int[] { left, right };
  }

  public void threeSum(int[] nums) {
    Arrays.sort(nums);
    Set<List<Integer>> array_list = new HashSet<List<Integer>>();
    for (int i = 0; i < nums.length; i++) {
      int left = i + 1;
      int right = nums.length - 1;
      while (left < right) {
        if (nums[i] + nums[left] + nums[right] == 0) {
          List<Integer> list = new ArrayList<Integer>();
          list.add(nums[i]);
          list.add(nums[left]);
          list.add(nums[right]);
          array_list.add(list);
          left++;
          right--;
        } else if (nums[i] + nums[left] + nums[right] > 0) {
          right--;
        } else {
          left++;
        }
      }
    }
    System.out.println(new ArrayList<>(array_list));
  }

  // Continue this problem
  // nums = [5, 7, 7, 8, 8, 10] target = 8
  public int[] searchRange(int[] nums, int target) {
    int[] result = new int[2];
    int l = 0;
    int r = nums.length - 1;
    while (l < r) {
      if (nums[l] != target) {
        l++;
      } else if (nums[r] != target) {
        r--;
      } else if (nums[l] == target && nums[r] == target) {
        result[0] = l;
        result[1] = r;
      } else {
        result[0] = -1;
        result[1] = -1;
      }
    }
    System.out.println(result[0]);
    return result;
  }

  public static void main(String[] args) throws Exception {
    Two_Pointers twoP = new Two_Pointers();
    // boolean ret = twoP.isPalindrome("ab2a");
    // int[] arr = { 2, 7, 11, 15 };
    // int[] indices = twoP.twoSum(arr, 9);
    // for (int ind : indices) {
    //   System.out.println(ind);
    // }
    // int[] triplets = { -1, 0, 1, 2, -1, 4 };
    // twoP.threeSum(triplets);
    int[] nums = { 5, 7, 7, 8, 8, 10 };
    int[] res = twoP.searchRange(nums, 8);
    for (int k : res) {
      System.out.println(k);
    }
  }
}
