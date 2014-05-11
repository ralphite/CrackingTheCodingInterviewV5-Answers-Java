//cci150 7.4

public class AddUtils {
    public static int multiply(int a, int b) {
        if(b==0) return 0;
        boolean isNegative = b < 0;
        if(isNegative) b = -b;
        int p = 0;
        int i = 0;
        while(i < b) {
            i = i + 1;
            p = p + a;
        }
        if(isNegative) {
            return -p;
        }
        return p;
    }
    public static int subtract(int a, int b) {
        return a + (-b);
    }
    public static int divide(int a, int b) {
        if(b==0) {
            throw new ArithmeticException("divide by 0");
        }
        boolean isNegative = multiply(a, b) < 0;
        if(a < 0) a = -a;
        if(b < 0) b = -b;
        int i = 0;
        while(a > b) {
            a = a + (-b);
            i = i + 1;
        }
        if(isNegative) {
            return -i;
        }
        return i;
    }
}
