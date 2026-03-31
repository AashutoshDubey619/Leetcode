class Solution {
    public long countPairs(int n, int[][] edges) {
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++) adj.add(new ArrayList<>());

        for(int[] e : edges){
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }

        boolean[] vis = new boolean[n];
        ArrayList<Integer> sizes = new ArrayList<>();

    
        for(int i = 0; i < n; i++){
            if(!vis[i]){
                int size = bfs(i, vis, adj);
                sizes.add(size);
            }
        }

        
        long ans = 0;
        long remaining = n;

        for(int size : sizes){
            ans += (long)size * (remaining - size);
            remaining -= size;
        }

        return ans;
    }

    public int bfs(int start, boolean[] vis, ArrayList<ArrayList<Integer>> adj){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        vis[start] = true;

        int size = 0;

        while(!q.isEmpty()){
            int node = q.poll();
            size++;

            for(int nei : adj.get(node)){
                if(!vis[nei]){
                    vis[nei] = true;
                    q.add(nei);
                }
            }
        }

        return size;
    }
}