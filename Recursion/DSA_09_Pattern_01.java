package Recursion;

public class DSA_09_Pattern_01 {
    public static void main(String[] args) {
        printPattern(5, 0);
    }

    public static void printPattern(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            System.out.printf("*");
            printPattern(row, col + 1);
        } else {
            System.out.println();
            printPattern(row - 1, 0);
        }
    }
}
