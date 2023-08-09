import  java.util.*;

public class neetcode2{
    public boolean areAnagrams(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        
        return Arrays.equals(sChars, tChars);
    }
    
    public static void main(String[] args) {
        neetcode2 solution = new neetcode2();
        String s = "listen";
        String t = "silent";
        boolean result = solution.areAnagrams(s, t);
        System.out.println("Are the strings anagrams? " + result);
    }
}
