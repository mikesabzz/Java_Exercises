import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

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
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = String.valueOf(chars);
            if(!map.containsKey(sortedStr)){
                // the arraylist is empty
                map.put(sortedStr, new ArrayList<String>());
            }
            // add the str that matches the characters of the sorted string
            map.get(sortedStr).add(str);
        }
        // return the new array
        System.out.println(new ArrayList<>(map.values()));
    }
    public List<String> letterCombinations(String digits) {
        HashMap<Character, String> map = new HashMap<>();
    
        for(int i=0; i<digits.length(); i++){
            char[] s = map.get(digits.charAt(i)).toCharArray();
            for(int j=0; j<s.length; j++){
                String k = s[j]+s[j];
                System.out.println(k);
            }
        }
        return new ArrayList(){};
    }
   

    public static void main(String[] args) throws Exception {
        Hashing hash = new Hashing();
        // hash.anagram("anagramb", "nambagar");
        String[] anagrams = {"eat","tea","tan","ate","nat","bat"};
        // hash.groupAnagrams(anagrams);
        hash.letterCombinations("23");
        
    }
}