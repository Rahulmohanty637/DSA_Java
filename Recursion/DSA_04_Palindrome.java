package Recursion;

public class DSA_04_Palindrome {
    public static void main(String[] args) {
        int num = 1468641;
        int placeValue = getHighestPlaceValue(num);
        System.out.println(placeValue);
        int palinNum = returnReverse(1468641, placeValue);
        if (num == palinNum){
            System.out.println("The number is palindrome !");
        }
        else {
            System.out.println("It is not a palindrome number");
        }
    }

    static int getHighestPlaceValue(int n){
        int placeValue = 1;
        while (n != 0){
            placeValue *= 10;
            n /= 10;
        }
        return placeValue/10;
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
