package Recursion;

public class DSA_LC_012_Pow_Function {
    public static void main(String[] args) {
        System.out.println(myPow(3, 3));
    }

    public static double myPow(double x, int n) {
        if (n == 0) return 1;
        if (n < 0) {
            n = Math.abs(n);
            x = 1 / x;
        }
        if (n % 2 == 0) return myPow(x * x, n / 2);
        else return myPow(x, n - 1);
    }

}
