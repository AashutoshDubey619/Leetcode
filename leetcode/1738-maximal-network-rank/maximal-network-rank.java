class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {

        List<HashSet<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < n; i++){
            adj.add(new HashSet<>());
        }

        int[] degree = new int[n];

        
        for(int[] road : roads){
            int u = road[0], v = road[1];

            adj.get(u).add(v);
            adj.get(v).add(u);

            degree[u]++;
            degree[v]++;
        }

        int max = 0;

        
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){

                int rank = degree[i] + degree[j];

                if(adj.get(i).contains(j)){
                    rank--; 
                }

                max = Math.max(max, rank);
            }
        }

        return max;
    }
}