import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Graph {

    // adjacency list to store the data // initialising it
    Map<Integer, ArrayList<Integer>> g;

    public Graph() {
        g = new HashMap<>();
    }

    public void addEdge(int u, int v, boolean isBidirec) {
        // get list of neighbours if there is a source that is present
        // else get a new ArrayList
        ArrayList<Integer> neigh = g.get(u);
        if (neigh == null) {
            ArrayList<Integer> nl = new ArrayList<>();
            nl.add(v);
            g.put(u, nl);
        } else {
            neigh.add(v);
            g.put(u, neigh);
        }
    }

    public String toString() {
        System.out.println(g.entrySet());
        return "This works";
    }

    


    public static void main(String[] args) {
        Graph g1 = new Graph();
        g1.addEdge(1, 2, false);
        g1.addEdge(3, 2, false);
        System.out.println(g1);

    }

}
