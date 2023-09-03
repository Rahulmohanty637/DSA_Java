package Recursion;

public class DS_03_Return_The_Reverse {
    public static void main(String[] args) {
        System.out.println(returnReverse(1428, 1000));
        // 694
    }

    static int returnReverse(int n, int m) {
        if (n == 0) {
            return 0;
        }
        int rem = n % 10;
        int res = n / 10;
        return (rem * m) + returnReverse(res, m / 10);
    }
}
