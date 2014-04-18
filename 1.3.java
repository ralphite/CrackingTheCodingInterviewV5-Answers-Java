//cci150 1.3

import java.util.HashMap;

public class StringUtil {
    public static boolean arePermutations(String s1, String s2) {
        if(s1 == null || s2 == null) return false;
        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        for(int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if(!map1.containsKey(c)) {
                map1.put(c, 1);
            } else {
                map1.put(c, map1.get(c) + 1);
            }
        }
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
        for(int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if(!map2.containsKey(c)) {
                map2.put(c, 1);
            } else {
                map2.put(c, map2.get(c) + 1);
            }
        }
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
