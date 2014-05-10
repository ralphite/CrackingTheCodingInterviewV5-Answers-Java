//cci150 5.1

public class BitwiseUtils {
    public static int insertNum(int m, int n, int i, int j) {
        //get lowest (j-i+1) bits of m
        m &= (1 << (j-i+1)) - 1;
        //shift m left by i positions
        m <<= i;
        //clear bits i through j in n
        n &= ~(((1 << (j + 1)) - 1) >>> i) << i;
        return n;
    }
}
