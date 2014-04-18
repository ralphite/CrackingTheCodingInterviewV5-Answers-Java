//cci150 1.1

import java.util.HashSet;

public class StringUtil {
    public static boolean hasUniqChars(String s) {
        if(s == null) return false;
        HashSet<Character> set = new HashSet<Character>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!set.contains(c)) {
                set.add(c);
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean hasUniqChars2(String s) {
        if(s == null) return false;
        //suppose all chars are ascii
        boolean[] charExists = new boolean[256];
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!charExists[c - '\0']) {
                charExists[c - '\0'] = true;
            } else {
                return false;
            }
        }
        return true;
    }
}
