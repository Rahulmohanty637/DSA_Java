package Problems;

public class DSA_LC_Happy_Numbers {
    private static int f;

    public static boolean isHappy(int n) {
        int s = n;
        int f = n;

        do {
            s = numSquare(s);
            f = numSquare(numSquare(f));
        } while (s != f);

        if (s == 1) {
            return true;
        }else {
            return false;
        }
    }

    private static int numSquare(int num) {
        int ans = 0;
        while (num > 0) {
            int rem = num % 10;
            ans += rem * rem;
            num /= 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }
}
