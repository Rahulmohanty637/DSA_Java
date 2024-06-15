package Interview_Questions;

import java.util.Scanner;

public class _02_Palindrome_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String input = sc.nextLine();
        int n = input.length();
        String reverse = "";
        for (int i = n -1; i >= 0; i--) {
            reverse += input.charAt(i);
        }
        if (reverse.equals(input)){
            System.out.println("true");
        }else {
            System.out.println("False");
        }
    }
}
