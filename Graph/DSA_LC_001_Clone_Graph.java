package Graph;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}


public class DSA_LC_001_Clone_Graph {

    private Map<Integer, Node> map = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }

        Node newNode = map.containsKey(node.val) ?
                map.get(node.val) : new Node(node.val, new ArrayList<Node>());
        map.put(node.val, newNode);
        for (Node neighbor : node.neighbors) {
            if (!map.containsKey(neighbor.val)) {
                Node newNeighborNode = cloneGraph(neighbor);
                map.put(neighbor.val, newNeighborNode);
            }
            newNode.neighbors.add(map.get(neighbor.val));
        }
        return newNode;
    }
}
