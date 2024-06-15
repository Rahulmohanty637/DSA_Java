package Interview_Questions;

import java.util.Scanner;

public class _01_Palindrome_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int input = sc.nextInt();
        int temp = input;
        int r, sum = 0;
        while (input > 0) {
            r = input % 10;
            sum = (sum * 10) + r;
            input = input / 10;
        }
        if (sum == temp) {
            System.out.println("The number " + temp + " is palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
