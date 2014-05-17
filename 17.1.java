//cci150 17.1

public class IntUtils {
    public static void swap(int[] pair) {
        pair[0] = pair[1] - pair[0];
        pair[1] = pair[1] - pair[0];
        pair[0] = pair[0] + pair[1];
    }
    public static void swap1(int[] pair) {
        pair[0] = pair[1] ^ pair[0];
        pair[1] = pair[1] ^ pair[0];
        pair[0] = pair[0] ^ pair[1];
    }
}
