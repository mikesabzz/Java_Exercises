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
        int n = s.length();
        int left_pointer = 0;
        int right_pointer = 0;
        int max = 0;
        HashSet<Character> charSet = new HashSet<>();
        while(right_pointer < n){
            if(!charSet.contains(s.charAt(right_pointer))){
                charSet.add(s.charAt(right_pointer));
                right_pointer++;
                max = Math.max(charSet.size(), max);
            } else {
                charSet.remove(s.charAt(left_pointer));
                left_pointer++;
            }
        }
        // System.out.println(max);
    }

}
