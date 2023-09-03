package Binary_Search.Two_Dimensional_Array;

import java.util.Arrays;

public class DS_01_Search_In_Matrices {
    public static int[] searchTarget (int [][] matrix, int target){
       int row = 0;
       int col = matrix.length - 1;

       int [] arr = new int[2];
       while(row < matrix.length && col >=0){
           if (matrix[row][col] == target){
               arr[0] = row;
               arr[1] = col;
               return arr;
           }
           if (matrix[row][col] < target){
               row++;
           }
           else if (matrix[row][col] > target){
               col--;
           }
       }
       arr[0] = -1;
       arr[1] = -1;
       return arr;
    }

    public static void main(String[] args) {
    int [][] matrix ={{10,20,30,40},{15,25,35,45},{28,29,37,49},{33,34,38,50}};

    int [] arr = searchTarget(matrix, 94);
    System.out.println(Arrays.toString(arr));
}
}
