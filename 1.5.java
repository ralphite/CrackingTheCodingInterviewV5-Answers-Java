//cci150 1.5

public class StringUtil {
    public static String compress(String s) {
        if(s == null || s.length() == 0) return s;
        
        StringBuilder sb = new StringBuilder();
        char curr = s.charAt(0);
        int count = 1;
        
        for(int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == curr) {
                count++;
            } else {
                sb.append(curr);
                sb.append(count);
                curr = c;
                count = 1;
            }
        }
        sb.append(curr);
        sb.append(count);
        
        if(sb.length() >= s.length()) {
            return s;
        } else {
            return sb.toString();
        }
    }
}
