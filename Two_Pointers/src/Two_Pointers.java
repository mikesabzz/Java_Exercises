import java.util.*;

public class Two_Pointers {
    public boolean isPalindrome(String s){
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            } 
            return false;
            
        }
        return true;
    }
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length -1;
        while(left < right){
            if(numbers[left] + numbers[right] > target){
                right--;
            } else if(numbers[left] + numbers[right] < target){
                left++;
            } else {
                return new int[] {left+1, right+1};
            }
        }
        return new int[] {left, right};
    }
    public static void main(String[] args) throws Exception {
        Two_Pointers twoP = new Two_Pointers();
        boolean ret = twoP.isPalindrome("ab2a");
        int[] arr = {2,7,11,15};
        int[] indices = twoP.twoSum(arr, 9);
        for(int ind : indices){
            System.out.println(ind);
        }
        
    }
}