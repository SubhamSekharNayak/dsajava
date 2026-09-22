import java.util.*;

public class BFSTraversal {

    public static void bfs(int start,
                           boolean vis[],
                           ArrayList<ArrayList<Integer>> adj,
                           ArrayList<Integer> ls) {

        // Create queue
        Queue<Integer> q = new LinkedList<>();

        // Mark starting node as visited
        vis[start] = true;

        // Add starting node to queue
        q.add(start);

        // BFS traversal
        while (!q.isEmpty()) {

            // Remove front node
            int node = q.poll();

            // Add current node to BFS result
            ls.add(node);

            // Visit all adjacent nodes
            for (Integer it : adj.get(node)) {

                if (vis[it] == false) {

                    vis[it] = true;

                    q.add(it);
                }
            }
        }
    }


    public static ArrayList<Integer> bfsOfGraph(
            int V,
            ArrayList<ArrayList<Integer>> adj) {

        boolean vis[] = new boolean[V];

        ArrayList<Integer> ls = new ArrayList<>();

        // Start BFS from node 0
        bfs(0, vis, adj, ls);

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


        // Perform BFS
        ArrayList<Integer> result =
                bfsOfGraph(V, adj);


        // Print BFS traversal
        System.out.println("BFS Traversal:");

        for (Integer node : result) {
            System.out.print(node + " ");
        }
    }
}



// import java.util.*;

// public class BFSTraversal {

//     // BFS function
//     public static void bfs(
//             int node,
//             boolean[] vis,
//             ArrayList<ArrayList<Integer>> adj,
//             ArrayList<Integer> ls) {

//         Queue<Integer> q = new LinkedList<>();

//         // Mark starting node as visited
//         vis[node] = true;

//         // Add starting node to queue
//         q.add(node);

//         while (!q.isEmpty()) {

//             // Remove front node
//             node = q.poll();

//             // Add current node to BFS traversal
//             ls.add(node);

//             // Visit all adjacent vertices
//             for (Integer it : adj.get(node)) {

//                 if (!vis[it]) {

//                     vis[it] = true;
//                     q.add(it);
//                 }
//             }
//         }
//     }


//     // BFS traversal
//     public static ArrayList<Integer> bfsOfGraph(
//             int V,
//             ArrayList<ArrayList<Integer>> adj,
//             int start) {

//         boolean[] vis = new boolean[V];

//         ArrayList<Integer> ls = new ArrayList<>();

//         // BFS from starting vertex
//         bfs(start, vis, adj, ls);

//         // Visit disconnected components
//         for (int i = 0; i < V; i++) {

//             if (!vis[i]) {

//                 bfs(i, vis, adj, ls);
//             }
//         }

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

//         // Perform BFS
//         ArrayList<Integer> result =
//                 bfsOfGraph(V, adj, start);

//         // Print BFS traversal
//         System.out.println("BFS Traversal:");

//         for (Integer node : result) {
//             System.out.print(node + " ");
//         }

//         System.out.println();

//         sc.close();
//     }
// }