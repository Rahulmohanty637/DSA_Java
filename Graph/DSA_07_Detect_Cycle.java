package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DSA_07_Detect_Cycle {

    public boolean checkForCycle(int src, int V, ArrayList<ArrayList<Integer>> adj, boolean vis[]) {
        vis[src] = true;
        Queue<pairs> q = new LinkedList<>();
        q.add(new pairs(src, -1));
        while (!q.isEmpty()) {
            int node = q.peek().first;
            int parent = q.peek().second;
            q.remove();

            for (int adjacentNode : adj.get(node)) {
                if (vis[adjacentNode] == false) {
                    vis[adjacentNode] = true;
                    q.add(new pairs(adjacentNode, node));
                } else if (parent != adjacentNode) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean vis[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            vis[i] = false;
        }
        for (int i = 0; i < V; i++) {
            if (vis[i] == false) {
                if (checkForCycle(i, V, adj, vis)) {
                    return true;
                }
            }
        }
        return false;
    }
}
