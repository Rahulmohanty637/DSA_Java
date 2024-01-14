package Stack;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean pushData(int item) {
        if (isFull()) {
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int popData() throws Exception{
        if (isEmpty()){
            throw new Exception("Cannot pop from empty stack");
        }
        return data[ptr--];
    }

    private boolean isFull() {
        return ptr == data.length - 1;
    }

    private boolean isEmpty() {
        return ptr == -1;
    }
}
