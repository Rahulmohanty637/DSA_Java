package Queue;

import Stack.CustomStack;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue();
        queue.insertData(67);
        queue.insertData(46);
        queue.insertData(29);
        queue.insertData(9);
        queue.insertData(15);

        queue.displayData();

    }
}
