package Recursion;

public class DS_02_Sum_of_Digits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(5389));
    }

    static int sumOfDigits (int n){
        if (n == 0){
            return 1;
        }
        int rem = n % 10;
        int res = n/10;
        return rem + sumOfDigits(res);
    }
}
