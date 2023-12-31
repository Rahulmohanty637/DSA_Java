package Patterns;

public class Pattern_108 {
    public static void main(String[] args) {
        int totalRow = 6;
        for (int row = 1; row < totalRow; row++) {
            for (int col = 1; col < totalRow; col++) {
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
//        *
//        **
//        ***
//        ****
//        *****