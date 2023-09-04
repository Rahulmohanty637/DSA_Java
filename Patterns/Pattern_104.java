package Patterns;

public class Pattern_104 {
    public static void main(String[] args) {
        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < row; col++) {
                System.out.printf("%d", col + 1);
            }
            System.out.println();
        }
    }
}


// OUTPUT :
//        1
//        12
//        123
//        1234
//        12345