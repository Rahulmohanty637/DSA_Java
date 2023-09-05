package Recursion;

// The following algorithm gives the count of any digit using recursion
public class DSA_05_Return_The_Count_Of_Digit {
    public static void main(String[] args) {
        int num = 6005090;
        System.out.println("The number of zeros present in the number is : " + getCount(num, 0));
    }

    public static int getCount(int num, int count) {
        if (num == 0) {
            return count;
        }
        int rem = num % 10;
        if (rem == 0) {
            return getCount(num / 10, count + 1);
        } else {
            return getCount(num / 10, count);
        }
    }
}
