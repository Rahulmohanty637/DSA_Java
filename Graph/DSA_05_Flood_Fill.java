package Graph;

public class DSA_05_Flood_Fill {

    public static void dfs(int[][] image, int[][] copy, int row, int col, int init, int newColor, int[] delrow, int[] delcol) {
        copy[row][col] = newColor;
        int n = image.length;
        int m = image[0].length;
        for (int i = 0; i < 4; i++) {
            int nrow = row + delrow[i];
            int ncol = col + delcol[i];
            if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && image[nrow][ncol]==init && copy[nrow][ncol] != newColor) {
                dfs(image, copy, nrow, ncol, init, newColor, delrow, delcol);
            }
        }
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int init = image[sr][sc];
        int[][] copy = image;
        int[] delrow = {-1, 0, +1, 0};
        int[] delcol = {0, -1, 0, +1};
        dfs(image, copy, sr, sc, init, newColor, delrow, delcol);
        return copy;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 1, 1}, {2, 2, 0}, {2, 2, 2}};
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        int[][] ans = floodFill(arr, 2, 0, 3);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
}
