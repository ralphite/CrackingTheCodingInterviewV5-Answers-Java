//cci150 17.9

import java.util.*;

public class Solution {
    public static int freq(String word, String[] book) {
        HashMap<String, Integer> map = new HashMap<>();
        for(String w : book) {
            if(map.containsKey(w)) {
                map.put(w, map.get(w) + 1);
            } else {
                map.put(w, 1);
            }
        }
        if(map.containsKey(word)) {
            return map.get(word);
        }else {
            return 0;
        }
    }

    public static int freq2(String word, String[] book) {
        int cnt = 0;
        for(String w : book) {
            if(w.equals(word)) {
                cnt++;
            }
        }
        return cnt;
    }
}
