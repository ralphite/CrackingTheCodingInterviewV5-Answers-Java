//cci150 18.4

//[0..n] 2

public class Solution {
    public static void main(String[] args) {
        for(int n : new int[]{-1, 0, 1, 2, 7, 11, 13, 222, 873274824}) {
            System.out.println(count(n));
        }
    }
    public static int count(int n) {
        assert n>=0;
        if(n < 2) return 0;
        if(n < 12) return 1;

        int d = n;
        int digitCount = 0;
        int p = 1;
        while(d / 10 > 0) {
            d /= 10;
            digitCount++;
            p *= 10;
        }
        // now d is the highest digit of n
        if(d == 1) {
            return count(n - d*p) + p*digitCount/10;
        } else if(d == 2) {
            return count(n - d*p) + 2*p*digitCount/10 + (n - d*p + 1);
        } else {
            return count(n - d*p) + d*p*digitCount/10 + p*digitCount;
        }
    }
}
