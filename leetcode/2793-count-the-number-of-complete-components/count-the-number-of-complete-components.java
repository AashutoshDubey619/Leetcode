class Solution {

    int count = 0;

    public int countCompleteComponents(int n, int[][] edges) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        int[] degree = new int[n];

        for (int[] edge : edges) {

            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
            adj.get(v).add(u);

            degree[u]++;
            degree[v]++;
        }

        boolean[] vis = new boolean[n];

        for (int i = 0; i < n; i++) {

            if (!vis[i]) {
                bfs(i, vis, adj, degree);
            }
        }

        return count;
    }

    public void bfs(int i,boolean[] vis,ArrayList<ArrayList<Integer>> adj,int[] degree) {

        Queue<Integer> q = new LinkedList<>();

        q.add(i);
        vis[i] = true;

        ArrayList<Integer> comp = new ArrayList<>();

        int size = 0;

        while (!q.isEmpty()) {

            int node = q.poll();

            comp.add(node);
            size++;

            for (int el : adj.get(node)) {

                if (!vis[el]) {
                    vis[el] = true;
                    q.add(el);
                }
            }
        }

        boolean flag = true;

        for (int node : comp) {

            if (degree[node] != size - 1) {
                flag = false;
                break;
            }
        }

        if (flag) count++;
    }
}