//cci150 5.5

public class BitwiseUtils {
    public static int diffBitsCount(int a, int b) {
        int c = a ^ b;
        //now count number of 1s in c
        int cnt = 0;
        while(c > 0) {
            int d = c & 1;
            if(d > 0) {
                cnt++;
            }
            c >>= 1;
        }
        return cnt;
    }
}
