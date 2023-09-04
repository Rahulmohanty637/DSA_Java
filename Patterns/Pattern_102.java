package Patterns;

public class Pattern_102 {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("*");
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
//        ******