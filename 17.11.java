//cci150 17.11

import java.util.*;

public class Main {
    public static void main(String... args) {
        int[] a = new int[5];
        int[] b = new int[7];
        for(int i = 0; i < 7000000; i++) {
            a[rand5()]++;
            b[rand7()]++;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
    public static int rand7() {
        int i = -1;
        while(i < 0 || i > 6) {
            i = (rand5() + rand5()*2 + rand5()*3 + rand5()*4 + rand5()*5 + rand5()*6) % 7;
        }
        return i;
    }
    public static int rand5() {
        return Math.abs(new Random().nextInt()) % 5;
    }
}
