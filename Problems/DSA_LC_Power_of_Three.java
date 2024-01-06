package Problems;

public class DSA_LC_Power_of_Three {
        public boolean isPowerOfThree(int n) {
            if (n == 0) {
                return false;
            }
            while (n % 3 == 0) {
                n /= 3;
            }
            return n == 1;
        }
}
