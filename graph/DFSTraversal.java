import java.util.*;

public class DFSTraversal {

    public static void dfs(int node, boolean vis[],
                           ArrayList<ArrayList<Integer>> adj,
                           ArrayList<Integer> ls) {

        // Mark current node as visited
        vis[node] = true;

        // Add current node to DFS result
        ls.add(node);

        // Visit all adjacent nodes
        for (Integer it : adj.get(node)) {

            if (vis[it] == false) {
                dfs(it, vis, adj, ls);
            }
        }
    }

    public static ArrayList<Integer> dfsOfGraph(
            int V,
            ArrayList<ArrayList<Integer>> adj) {

        boolean vis[] = new boolean[V];

        ArrayList<Integer> ls = new ArrayList<>();

        // Start DFS from node 0
        dfs(0, vis, adj, ls);

        return ls;
    }

    public static void main(String[] args) {

        // Number of vertices
        int V = 5;

        // Create adjacency list
        ArrayList<ArrayList<Integer>> adj =
                new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges
        // Graph:
        //
        //      0
        //     / \
        //    1   2
        //    |   |
        //    3   4

        adj.get(0).add(1);
        adj.get(1).add(0);

        adj.get(0).add(2);
        adj.get(2).add(0);

        adj.get(1).add(3);
        adj.get(3).add(1);

        adj.get(2).add(4);
        adj.get(4).add(2);

        // Perform DFS
        ArrayList<Integer> result =
                dfsOfGraph(V, adj);

        // Print DFS traversal
        System.out.println("DFS Traversal:");

        for (Integer node : result) {
            System.out.print(node + " ");
        }
    }
}



// import java.util.*;

// public class DFSTraversal {

//     // DFS function
//     public static void dfs(int node,
//                            boolean[] vis,
//                            ArrayList<ArrayList<Integer>> adj,
//                            ArrayList<Integer> ls) {

//         // Mark current node as visited
//         vis[node] = true;

//         // Add current node to DFS traversal
//         ls.add(node);

//         // Visit all adjacent vertices
//         for (Integer it : adj.get(node)) {

//             if (!vis[it]) {
//                 dfs(it, vis, adj, ls);
//             }
//         }
//     }

//     // DFS traversal
//     public static ArrayList<Integer> dfsOfGraph(
//             int V,
//             ArrayList<ArrayList<Integer>> adj,
//             int start) {

//         boolean[] vis = new boolean[V];

//         ArrayList<Integer> ls = new ArrayList<>();

//         dfs(start, vis, adj, ls);

//         return ls;
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         // Number of vertices
//         System.out.print("Enter number of vertices: ");
//         int V = sc.nextInt();

//         // Number of edges
//         System.out.print("Enter number of edges: ");
//         int E = sc.nextInt();

//         // Choose graph type
//         System.out.println("Enter graph type:");
//         System.out.println("1. Undirected");
//         System.out.println("2. Directed");

//         int type = sc.nextInt();

//         // Create adjacency list
//         ArrayList<ArrayList<Integer>> adj =
//                 new ArrayList<>();

//         for (int i = 0; i < V; i++) {
//             adj.add(new ArrayList<>());
//         }

//         // Input edges
//         System.out.println("Enter the edges:");

//         for (int i = 0; i < E; i++) {

//             int u = sc.nextInt();
//             int v = sc.nextInt();

//             // u -> v
//             adj.get(u).add(v);

//             // If undirected, also add v -> u
//             if (type == 1) {
//                 adj.get(v).add(u);
//             }
//         }

//         // Starting vertex
//         System.out.print("Enter starting vertex: ");
//         int start = sc.nextInt();

//         // Perform DFS
//         ArrayList<Integer> result =
//                 dfsOfGraph(V, adj, start);

//         // Print DFS traversal
//         System.out.println("DFS Traversal:");

//         for (Integer node : result) {
//             System.out.print(node + " ");
//         }

//         sc.close();
//     }
// }