
/*
 * Tester
 */
public class Tester {
    public int[] twoSum(int[] nums, int target) {
        int[] sum = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    sum[0] = i;
                    sum[1] = j;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 4 };
        Tester test = new Tester();
        int[] result = test.twoSum(nums, 6);
        for (int i : result) {
            System.out.println(i);
        }
    }
}