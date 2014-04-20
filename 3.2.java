//cci150 3.2

/**
 *  it's possible to pop out the min value.
 *  if we want to make pop O(1) we can save
 *  a min val for each element
 */

import java.util.EmptyStackException;

public class MinStack {
    MinStackNode top;

    public void push(int v) {
        MinStackNode node = new MinStackNode();
        node.data = v;
        if(top != null && top.min < v) {
            node.min = top.min;
        } else {
            node.min = v;
        }
        node.next = top;
        top = node;
    }

    public int pop() {
        if(top != null) {
            MinStackNode node = top;
            top = top.next;
            return node.data;
        } else {
            throw new EmptyStackException();
        }
    }

    public int min() {
        if(top == null) {
            throw new EmptyStackException();
        } else {
            return top.min;
        }
    }

    private static class MinStackNode {
        int data;
        int min;
        MinStackNode next;
    }
}
