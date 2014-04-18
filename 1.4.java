//cci150 1.4

public class StringUtil {
    public static void replaceSpaces(char[] s, int len) {
        int pos1 = len - 1;
        int pos2 = s.length - 1;
        while(pos1 >= 0) {
            if(s[pos1] != ' ') {
                s[pos2--] = s[pos1];
            } else {
                s[pos2--] = '0';
                s[pos2--] = '2';
                s[pos2--] = '%';
            }
            pos1--;
        }
    }
}
