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
    public static void main(String[] args) throws Exception {
        Two_Pointers twoP = new Two_Pointers();
        boolean ret = twoP.isPalindrome("ab2a");
        
    }
}