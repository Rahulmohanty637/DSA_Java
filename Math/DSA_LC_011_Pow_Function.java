package Math;

public class DSA_LC_011_Pow_Function {
    public static void main(String[] args) {

    }

    public static double myPow(double x, int n) {
        double res = 1;
        long temp = n;
        if (temp < 0) {
            temp *= -1;
        }
        while (temp > 0) {
            if (temp % 2 == 0) {
                x = x * x;
                temp = temp / 2;
            } else {
                res = res * x;
                temp--;
            }
        }

        if (n < 0) {
            return (double) 1 / res;
        }

        return res;
    }
}
