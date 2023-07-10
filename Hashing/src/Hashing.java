import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Hashing {
    public boolean anagram(String s, String t){
        if(s.length() != t.length()){
            return true;
        }
        HashMap<Character, Integer> sMap = new HashMap<Character, Integer>();
        HashMap<Character, Integer> tMap = new HashMap<Character, Integer>();
        for(int i = 0; i<s.length(); i++){    
            if(sMap.containsKey(s.charAt(i))){
                sMap.put(s.charAt(i), sMap.get(s.charAt(i)) + 1);
            } else {
                sMap.put(s.charAt(i), 1);
            }
            if(tMap.containsKey(t.charAt(i))){
                tMap.put(t.charAt(i), tMap.get(t.charAt(i)) + 1);
            } else {
                tMap.put(t.charAt(i), 1);
            }
        }
        if(sMap.equals(tMap)){
            return true;
        } else {
            return false;
        }
    }
    public void groupAnagrams(String[] strs){
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0; i<strs.length; i++){
            
        }
     
    }
   

    public static void main(String[] args) throws Exception {
        Hashing hash = new Hashing();
        hash.anagram("anagramb", "nambagar");
        String[] anagrams = {"eat","tea","tan","ate","nat","bat"};
        hash.groupAnagrams(anagrams);
        
        
    }
}