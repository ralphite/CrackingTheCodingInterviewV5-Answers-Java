//cci150 3.1

/**
 *  if only one stack just maintain a current index
 *  as the location of the top element.
 *  since we need to support 3 stacks, we can modulo
 *  3 for each index, if remainder==0 ...
 */

public class TrippleStacks {
    private int[] data;
    private int index1;
    private int index2;
    private int index3;
    private static final int DEFAULT_LENGTH = 3000;

    public TrippleStacks() {
        data = new int[DEFAULT_LENGTH];
        index1 = 0;
        index2 = 1;
        index3 = 2;
    }

    public void push1(int v) {
        data[index1] = v;
        index1 += 3;
    }
    public int pop1() {
        if(index1 >= 3) {
            index1 -= 3;
            return data[index1];
        } else {
            throw new EmptyStackException();
        }
    }
    public int peek1() {
        if(index1 >= 3) {
            return data[index1 - 3];
        } else {
            throw new EmptyStackException();
        }
    }

    public void push2(int v) {
        data[index2] = v;
        index2 += 3;
    }
    public int pop2() {
        if(index2 >= 4) {
            index2 -= 3;
            return data[index2];
        } else {
            throw new EmptyStackException();
        }
    }
    public int peek2() {
        if(index2 >= 4) {
            return data[index2 - 3];
        } else {
            throw new EmptyStackException();
        }
    }

    public void push3(int v) {
        data[index3] = v;
        index3 += 3;
    }
    public int pop3() {
        if(index3 >= 5) {
            index3 -= 3;
            return data[index3];
        } else {
            throw new EmptyStackException();
        }
    }
    public int peek3() {
        if(index3 >= 5) {
            return data[index3 - 3];
        } else {
            throw new EmptyStackException();
        }
    }
}
