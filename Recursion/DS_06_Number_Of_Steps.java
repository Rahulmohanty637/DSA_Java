package Recursion;

public class DS_06_Number_Of_Steps {
    public static void main(String[] args) {
        int num = 14;
        System.out.println(getSteps(num, 0));
    }

    public static int getSteps(int num, int count) {
        if (num == 0) {
            return count;
        }
        if (num % 2 == 0) {
            return getSteps(num / 2, count + 1);
        } else {
            return getSteps(num - 1, count + 1);
        }
    }
}
