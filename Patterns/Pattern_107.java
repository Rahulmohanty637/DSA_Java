package Patterns;

public class Pattern_107 {
    public static void main(String[] args) {
        for (int row = 6; row > 0; row--) {
            for (int col = 6; col > 0; col--) {
                if (row >= col) {
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

// * * * * * *
//  * * * * *
//   * * * *
//    * * *
//     * *
//      *