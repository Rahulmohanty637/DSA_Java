package Problems;

import java.util.Scanner;

public class MissingLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of letters: ");
        int n = scanner.nextInt();

        System.out.print("Enter the sequence of letters: ");
        scanner.nextLine();
        String input = scanner.nextLine();

        char missingLetter = findMissingLetter(n, input);

        if (missingLetter != 0) {
            System.out.println("The missing letter is: " + missingLetter);
        } else {
            System.out.println("No missing letter found.");
        }

        scanner.close();
    }

    private static char findMissingLetter(int n, String input) {
        char[] sequence = input.toCharArray();
        char expectedLetter = 'a';

        for (int i = 0; i < n; i++) {
            if (i < sequence.length && sequence[i] == expectedLetter) {
                expectedLetter++;
            } else {
                return expectedLetter;
            }
        }

        return 0;
    }
}
