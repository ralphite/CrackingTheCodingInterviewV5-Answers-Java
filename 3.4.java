//cci150 3.4

public class Hanoi {
    /**
     * move plates from a to c, use b as buffer
     * @param a size of a should be n
     * @param b buffer. should be empty in the begining
     * @param c destination. should be empty in the begining
     */
    public static void move(Stack a, Stack b, Stack c, int n) {
        if(n==1) {
            c.push(a.pop());
            return;
        }
        move(a, c, b, n - 1);
        c.push(a.pop());
        move(b, c, a, n - 1);
    }
}
