package Queue;

import java.util.Stack;

// To implement a Queue using two stacks, we have to jiggle the item from one stack to another
// Push the items in first stack and to remove the item, transfer all the items to second stack from first stack. Then remove pop the item from second stack.



public class DSA_LC_001_Implement_Queue_Using_Stack {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public DSA_LC_001_Implement_Queue_Using_Stack() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push(int x) {
        first.push(x);
    }

    public int pop() {
        while (!first.isEmpty()) {
            int popped = first.pop();
            second.push(popped);
        }

        int removed = second.pop();

        while (!second.isEmpty()) {
            int popped = second.pop();
            first.push(popped);
        }

        return removed;
    }

    public int peek() {
        while (!first.isEmpty()) {
            int popped = first.pop();
            second.push(popped);
        }

        int peeked = second.peek();

        while (!second.isEmpty()) {
            int popped = second.pop();
            first.push(popped);
        }

        return peeked;
    }

    public boolean empty() {
        return first.isEmpty();
    }
}
