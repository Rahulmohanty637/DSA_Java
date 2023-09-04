package Patterns;

public class Pattern_103 {
    public static void main(String[] args) {
        for (int i = 6; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}


// OUTPUT :
//        ******
//        *****
//        ****
//        ***
//        **
//        *