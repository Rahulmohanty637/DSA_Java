package Patterns;

public class Pattern_109 {
    public static void main(String[] args) {
        int totalRow = 6;
        for (int row = totalRow; row > 0; row--) {
            for (int col = 0; col < totalRow; col++) {
                if ((totalRow - col) <= row) {
                    System.out.printf("*");
                } else {
                    System.out.printf(" ");
                }
            }
            System.out.println();
        }
    }
}


// OUTPUT :
//       ******
//        *****
//         ****
//          ***
//           **
//            *