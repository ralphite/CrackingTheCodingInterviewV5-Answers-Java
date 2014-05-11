//cci150 5.3

//next means closest

public class BitwiseUtils {
    public static int nextPermutation(int n) {
        if(n <= 0) {
            throw new IllegalArgumentException("n should be positive.");
        }
        if(n > 0x3fffffff) {
            throw new IllegalArgumentException("n is too big to handle.");
        }
        int cnt0 = 0;
        int cnt1 = 0;
        int n1 = n;
        while((n1 & 1) == 0) {
            n1 >>= 1;
            cnt0++;
        }
        while((n1 & 1) != 0) {
            n1 >>>= 1;
            cnt1++;
        }
        n |= 1 << (cnt0 + cnt1);
        n &= ~(1 << (cnt0 + cnt1) - 1);
        n |= (1 << (cnt1 - 1)) - 1;
        return n;
    }
    public static int pervPermutation(int n) {
        if(n <= 0) {
            throw new IllegalArgumentException("n should be positive.");
        }
        if(n == 1) {
            throw new IllegalArgumentException("n should be bigger than 1");
        }
        if(((n +1) &n)==0) {
            throw new IllegalArgumentException("n cannot be 2^k - 1");
        }
        int cnt0 = 0;
        int cnt1 = 0;
        int n1 = n;
        while((n1 & 1) != 0) {
            n1>>>=1;
            cnt1++;
        }
        while((n1 & 1) == 0) {
            n1 >>>= 1;
            cnt0++;
        }
        n &= ~(1 << (cnt0 + cnt1));
        n |= (1 << (cnt0 + cnt1)) - 1;
        n &= ~((1 << cnt0 - 1) - 1);
        return n;
    }
}
