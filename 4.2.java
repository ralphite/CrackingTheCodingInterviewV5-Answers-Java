//cci150 4.2

import java.util.*;

class GraphNode {
    int val;
    Set<GraphNode> descendants;
    GraphNode(int v) {
        val = v;
        descendants = new HashSet<GraphNode>();
    }
}

public class GraphNodeUtils {
    public boolean hasConnection(GraphNode a, GraphNode b) {
        HashSet<GraphNode> set = new HashSet<GraphNode>();
        if(hasConnection2(a, b, set)) return true;
        set.clear();
        return hasConnection2(b, a, set);
    }
    private boolean hasConnection2(GraphNode a, GraphNode b, HashSet<GraphNode> set) {
        if(a==null || b==null) return false;
        if(a==b) return true;
        set.add(a);
        for(GraphNode n : a.descendants) {
            if(!set.contains(n)) {
                if(hasConnection2(n, b, set)) {
                    return true;
                }
            }
        }
        return false;
    }
}
