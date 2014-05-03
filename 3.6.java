//cci150 3.6

public class StackUtils<Item extends Comparable<Item>> {
    public static void sort(Stack<Item> stack) {
        Stack<Item> buffer = new Stack<Item>();
        if(stack == null || stack.size() <= 1) {
            return;
        }
        while(!stack.isEmpty()) {
            Item i = stack.pop();
            int count = 0;
            while(!buffer.isEmpty() && i.compareTo(buffer.peek()) > 0) {
                stack.push(buffer.pop());
                count++;
            }
            buffer.push(i);
            while(count-- > 0) {
                buffer.push(stack.pop());
            }
        }
        while(!buffer.isEmpty()) {
            stack.push(buffer.pop());
        }
    }
}
