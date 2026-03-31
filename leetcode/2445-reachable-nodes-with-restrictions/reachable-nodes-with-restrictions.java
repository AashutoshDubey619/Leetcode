class Solution {
    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        
        HashSet<Integer> set = new HashSet<>();
        boolean[] vis = new boolean[n];

        for(int el : restricted) set.add(el);

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i =0;i<n;i++)adj.add(new ArrayList<>());

        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        vis[0] = true;
        
        while(q.size() > 0){
            int node = q.poll();

            vis[node] = true;

            for(int el : adj.get(node)){
                if(!set.contains(el) && !vis[el]){
                    vis[el] = true;
                    q.add(el);
                }
            }
        }

        int count = 0;

        for(int i=0;i<vis.length;i++){
            if(vis[i])count++;
        }

        return count;
    }
}