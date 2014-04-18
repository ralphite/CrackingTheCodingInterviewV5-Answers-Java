//cci150 1.3

import java.util.HashMap;

public class StringUtil {
    public static boolean arePermutations(String s1, String s2) {
        if(s1 == null || s2 == null) return false;
        HashMap<Character, Integer> map1 = count(s1);
        HashMap<Character, Integer> map2 = count(s2);
        return checkEqual(map1, map2);
    }
    private static HashMap<Character, Integer> count(String s) {
        if(s == null) return null;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
        return map;
    }
    private static boolean checkEqual(HashMap<Character, Integer> map1, 
        HashMap<Character, Integer> map2) {
        if(map1 == null || map2 == null) return false;
        if(map1.size() != map2.size()) {
            return false;
        }
        for(char c : map1.keySet()) {
            if(map1.get(c) != map2.get(c)) {
                return false;
            }
        }
        return true;
    }
}
