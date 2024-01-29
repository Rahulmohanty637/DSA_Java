package Queue;

import Stack.CustomStack;

public class QueueMain {
    public static void main(String[] args) throws Exception {
//        CustomQueue queue = new CustomQueue();
//        queue.insertData(67);
//        queue.insertData(46);
//        queue.insertData(29);
//        queue.insertData(9);
//        queue.insertData(15);
//
//        queue.displayData();

        CircularQueue queue = new CircularQueue(5);
        queue.insertData(67);
        queue.insertData(44);
        queue.insertData(19);
        queue.insertData(35);
        queue.insertData(9);

        queue.displayData();
        queue.removeData();
        queue.displayData();
        queue.insertData(76);
        queue.displayData();

    }
}
