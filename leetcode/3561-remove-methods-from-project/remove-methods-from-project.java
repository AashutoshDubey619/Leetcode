class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {

        boolean[] vis = new boolean[n];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++)
            adj.add(new ArrayList<>());

        for (int[] inv : invocations)
            adj.get(inv[0]).add(inv[1]);

        bfs(k, vis, adj);

        for (int i = 0; i < n; i++) {
            if (vis[i]) continue;

            for (int el : adj.get(i)) {
                if (vis[el]) {
                    List<Integer> ans = new ArrayList<>();
                    for (int j = 0; j < n; j++)
                        ans.add(j);
                    return ans;
                }
            }
        }

        
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!vis[i])
                res.add(i);
        }

        return res;
    }

    public void bfs(int k, boolean[] vis, ArrayList<ArrayList<Integer>> adj) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(k);
        vis[k] = true;

        while (!q.isEmpty()) {
            int node = q.poll();

            for (int nxt : adj.get(node)) {
                if (!vis[nxt]) {
                    vis[nxt] = true;
                    q.offer(nxt);
                }
            }
        }
    }
}