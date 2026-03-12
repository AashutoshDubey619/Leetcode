class Solution {

    public int removeStones(int[][] stones) {

        int n = stones.length;
        boolean[] vis = new boolean[n];

        int components = 0;

        for(int i = 0; i < n; i++){
            if(!vis[i]){
                components++;
                bfs(i, stones, vis);
            }
        }

        return n - components;
    }

    public void bfs(int start, int[][] stones, boolean[] vis){

        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        vis[start] = true;

        while(!q.isEmpty()){

            int node = q.poll();

            for(int j = 0; j < stones.length; j++){

                if(!vis[j] &&
                   (stones[node][0] == stones[j][0] ||
                    stones[node][1] == stones[j][1])){

                    vis[j] = true;
                    q.add(j);
                }
            }
        }
    }
}