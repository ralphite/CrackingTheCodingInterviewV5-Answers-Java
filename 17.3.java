//cci150 17.3

public class Solution {
    public static int factorialTrailingZeros(int n) {
        if(n <= 1) return 0;
        int cnt = 0;
        while(n > 0) {
            cnt += n/5;
            n /= 5;
        }
        return cnt;
    }
}
