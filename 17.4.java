//cci150 17.4

public class Solution {
    public static int max(int a, int b) {
        //a>>31 is 0xffffffff if a<0
        //(a>>31)&a is 0 when a>=0 and a when a<0
        return a - ((a-b)>>31) & (a-b);
    }
}
