class Solution {
  
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        if(n == 1) return true;
        if(source == destination) return true;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0;i<n;i++) adj.add(new ArrayList<>());

        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean[] visited = new boolean[n];

       return bfs(source , destination , visited , adj);
    }

    public boolean bfs(int source , int destination , boolean[] visited ,ArrayList<ArrayList<Integer>> adj ){
        visited[source] = true;

        Queue<Integer> q = new LinkedList<>();

        q.add(source);

        while(q.size() > 0){
            int node = q.poll();

            for(int el : adj.get(node)){
                if(!visited[el]){
                    if(el == destination) return true;
                    visited[el] = true;
                    q.add(el);
                }
            }
        }

        return false;
    }
}