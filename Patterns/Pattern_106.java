package Patterns;

public class Pattern_106 {
    public static void main(String[] args) {
        for (int row = 0; row < 6; row++) {
            for (int col = 0; col <= 6; col++) {
                if (row >= (6 - col)) {
                    System.out.printf("* ");
                } else {
                    System.out.printf(" ");
                }
            }
            System.out.println();
        }
    }
}

// OUTPUT :
//              *
//             * *
//            * * *
//           * * * *
//          * * * * *
//         * * * * * *
