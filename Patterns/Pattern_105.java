package Patterns;

public class Pattern_105 {
    public static void main(String[] args) {
        for (int row = 1; row < 10; row++) {
            int count = row > 5 ? 10 - row : row;
            for (int col = 1; col < count; col++) {
                System.out.printf("* ");
            }
            System.out.println();
        }
    }
}


// OUTPUT :
//        *
//        * *
//        * * *
//        * * * *
//        * * *
//        * *
//        *