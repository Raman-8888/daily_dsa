import java.util.Arrays;

class Solution {
    
    // Disjoint Set (Union-Find) Helper Class
    class DisjointSet {
        int[] parent;
        int[] rank;

        public DisjointSet(int n) {
            parent = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        public int find(int i) {
            if (parent[i] != i) {
                parent[i] = find(parent[i]); // Path compression
            }
            return parent[i];
        }

        public boolean union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);

            if (rootX != rootY) {
                // Union by rank
                if (rank[rootX] < rank[rootY]) {
                    parent[rootX] = rootY;
                } else if (rank[rootX] > rank[rootY]) {
                    parent[rootY] = rootX;
                } else {
                    parent[rootY] = rootX;
                    rank[rootX]++;
                }
                return true; // Union successful, no cycle created
            }
            return false; // Already in the same set, cycle detected
        }
    }

    public int spanningTree(int V, int[][] edges) {
        // Step 1: Sort edges by weight in ascending order
        // edges[i][0] = u, edges[i][1] = v, edges[i][2] = weight
        Arrays.sort(edges, (a, b) -> Integer.compare(a[2], b[2]));

        DisjointSet ds = new DisjointSet(V);
        int totalWeight = 0;
        int edgesCount = 0;

        // Step 2: Process sorted edges
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int weight = edge[2];

            // If u and v do not belong to the same components, include the edge
            if (ds.union(u, v)) {
                totalWeight += weight;
                edgesCount++;

                // Optimization: Stop early once we have V - 1 edges
                if (edgesCount == V - 1) {
                    break;
                }
            }
        }

        return totalWeight;
    }
}
