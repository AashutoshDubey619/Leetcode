class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0;i<graph.length;i++){
            adj.add(new ArrayList<>());
        }

        int[] indegree = new int[graph.length];

        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].length;j++){
                adj.get(graph[i][j]).add(i);

                indegree[i]++;
            }
        }

        ArrayList<Integer> res = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<graph.length;i++){
            if(indegree[i] == 0)q.add(i);
        }


        while(q.size() > 0){
            int vertex = q.poll();

            res.add(vertex);

            for(int el : adj.get(vertex)){
                if(indegree[el] != 0){
                    indegree[el]--;
                    if(indegree[el] == 0)q.add(el);
                }
            }
        }

        Collections.sort(res);
        return res;
    }
}