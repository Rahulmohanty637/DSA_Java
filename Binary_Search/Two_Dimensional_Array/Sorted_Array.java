package Binary_Search.Two_Dimensional_Array;

public class Sorted_Array {
    public static int[] binarySearch (int [][] matrix, int row, int cStart, int cEnd, int target){
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target){
                return new int[]{row,mid};
            }
            if (matrix[row][mid] < target){
                cStart = mid + 1;
            }
            else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }
    public static int[] searchRowColumn (int [][] matrix, int target){
        int row = 0;
        int col = matrix[0].length - 1;
        int cMid = col / 2;
        int rStart = 0;
        int rEnd = matrix.length - 1;
        if (row == 1){
            return binarySearch(matrix,0,0,col,target);
        }
        while(rStart < (rEnd - 1)){
            int rMid = rStart + (rEnd - rStart) / 2;
            if (matrix[rMid][cMid] == target){
                return new int[]{rMid,cMid};
            }
            else if (matrix[rMid][cMid] < target){
                rStart = rMid;
            }
            else {
                rEnd = rMid;
            }
        }
        return new int[]{-1, -1};
    }
}
