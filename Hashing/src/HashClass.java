import java.util.*;

public class HashClass {
    public static void main(String[] args) throws Exception {
        HashClass hash = new HashClass();
        hash.findLongestSubstringLength("nndNfdfdf");
    }
    // Given a string, s, find the length of the longest substring that contains
    // no repeated characters
    // "ndNf" is the longest subsrting
    public void findLongestSubstringLength(String s){
        HashSet<Character> set = new HashSet<>();
        int n = s.length();
        int left_pointer = 0;
        int right_pointer = 0;
        int maxlength = 0;
        while(right_pointer < n){
            if(!set.contains(s.charAt(right_pointer))){
                set.add(s.charAt(right_pointer));
                right_pointer++;
                maxlength = Math.max(set.size(), maxlength);
            } else {
                set.remove(s.charAt(left_pointer));
                left_pointer++;
            }
        }
        System.out.println(maxlength);
    }

}
