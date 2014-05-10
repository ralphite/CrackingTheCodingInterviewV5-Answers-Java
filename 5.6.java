//cci150 5.6

public class BitwiseUtils {
    public static int swapOddEvenBits(int n) {
        return ((n & 0x55555555) << 1) | ((n & 0xAAAAAAAA) >>> 1);
    }
}
