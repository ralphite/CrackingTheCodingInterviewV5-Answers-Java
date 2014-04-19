//cci150 1.8

public class StringUtil {
    public static boolean checkRotation(String s1, String s2) {
        //s1 = a+b s2 = b+a s1s1 = a+b+a+b
        if(s1 == null || s2 == null || s1.length() != s2.length()) return false;
        return isSubstring(s1 + s1, s2); //check if s2 is a substring of s1+s1
    }
}
