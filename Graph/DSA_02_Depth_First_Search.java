package Graph;

import java.util.ArrayList;

public class DSA_02_Depth_First_Search {

    public static void dfs(int start, boolean[] vis, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ls){
        vis[start] = true;
        ls.add(start);

        for(Integer it : adj.get(start)) {
            if (vis[it] == false) {
                dfs(it, vis, adj, ls);
            }
        }
    }

    public static ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj){
        boolean [] vis = new boolean[V];
        vis[0] = true;
        ArrayList<Integer> ls = new ArrayList<>();
        dfs(0, vis, adj, ls);
        return ls;
    }
}
