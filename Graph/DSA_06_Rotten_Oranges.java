package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class DSA_06_Rotten_Oranges {
    class pairs {
        int first;
        int second;
        int time;

        public pairs(int first, int second, int time) {
            this.first = first;
            this.second = second;
            this.time = time;
        }
    }

    public int orangesRotting(int[][] grid) {

        Queue<pairs> q = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;
        int cntfresh = 0;
        int[][] vis = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    q.add(new pairs(i, j, 0));
                    vis[i][j] = 2;
                }else {
                    vis[i][j] = 0;
                }
                if (grid[i][j] == 1){
                    cntfresh++;
                }
            }
        }

        int time = 0;
        int delrow[] = {-1, 0, +1, 0};
        int delcol[] = {0, +1, 0, -1};
        int cnt = 0;
        while (!q.isEmpty()) {
            int r = q.peek().first;
            int c = q.peek().second;
            int t = q.peek().time;
            time = Math.max(time, t);
            q.remove();
            for (int i = 0; i < 4; i++) {
                int nrow = r + delrow[i];
                int ncol = c + delcol[i];
                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && vis[nrow][ncol] == 0 && grid[nrow][ncol] == 1) {
                    q.add(new pairs(nrow, ncol, t + 1));
                    vis[nrow][ncol] = 2;
                    cnt++;
                }
            }
        }

        if (cnt != cntfresh){
            return -1;
        }
        return time;
    }

}
