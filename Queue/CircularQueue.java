package Queue;

public class CircularQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;
    int front = 0;
    int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean insertData(int item) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return false;
        }
        data[end++] = item;
        end = end % data.length; // ptr is at last index
        size++;
        return true;
    }

    public int removeData() {
        int item = data[front++];
        front = front % data.length;
        size--;
        return item;
    }

    public void displayData() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty");
        }
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " --> ");
        }
        System.out.println("END");
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return end == 0;
    }
}
