//cci150 3.5

public class MyQueue<Item> {
    private Stack<Item> stack1;
    private Stack<Item> stack2;

    public void enqueue(Item i) {
        stack1.push(i);
    }
    public Item dequeue() {
        if(!stack2.isEmpty()) {
            return stack2.pop();
        } else {
            while(!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }
    }
    public int size() {
        return stack1.size() + stack2.size();
    }
    public boolean isEmpty() {
        return this.size() == 0;
    }
}
