import java.util.*;

public class SlidingWindow {
    // Not Finished
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int l=0; 
        int n = s.length();
        int res = 0;
        for(int r=0; r<n; r++){
            map.put(s.charAt(r), 1 + map.get(s.charAt(r)) );
            if(r-l+1- Math.max(map.values) > k){
                l++;
            }
            res = Math.max(res, r-l+1);
        }
        return res;
        
    }
    public boolean checkInclusion(String s1, String s2){
        int l = 0;
        int r = 1;
        while(r < s2.length()){
            if(s1.charAt(0)+s1.charAt(1) == s2.charAt(l)+s2.charAt(r) ||
                s1.charAt(1)+s1.charAt(0) == s2.charAt(l)+s2.charAt(r)){
                return true;
            } else {
                l = r;
            }
            r++;
        }
        return false;
    }
    public static void main(String[] args){
        SlidingWindow sldWnd = new SlidingWindow();
        int res = sldWnd.characterReplacement("ABAB", 2);
        // System.out.print(res);
        boolean perm = sldWnd.checkInclusion("ab", "eidooab");
        System.out.println(perm);
    }
}