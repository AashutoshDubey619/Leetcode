class Solution {

    public int makeConnected(int n, int[][] connections) {
        int count = -1;

        if(connections.length < n - 1)return count;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        boolean vis[] = new boolean[n];

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<connections.length;i++){
            int u = connections[i][0];
            int v = connections[i][1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }


        for(int i=0;i<n;i++){
            if(!vis[i]){
                count++;
                bfs(i , vis , adj);
            }
        }

        return count;
    }

    public void bfs(int i , boolean[] vis ,  ArrayList<ArrayList<Integer>> adj){
        Queue<Integer> q = new LinkedList<>();

        q.add(i);
        vis[i] = true;

        while(q.size() > 0){
            int node = q.poll();

            for(int el : adj.get(node)){
                if(!vis[el]){
                    vis[el] = true;
                    q.add(el);
                }
            }
        }
    }
}