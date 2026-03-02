class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }

        int[] indegree = new int[numCourses];

        for(int i=0;i<prerequisites.length;i++){
            int u = prerequisites[i][0];
            int v = prerequisites[i][1];

            adj.get(v).add(u);
            indegree[u]++;
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<indegree.length;i++){
            if(indegree[i] == 0)q.add(i);
        }

        ArrayList<Integer> res = new ArrayList<>();

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

       
       if(res.size() < numCourses)return new int[0];
       int[] ans = new int[res.size()];


        for(int i = 0; i < res.size(); i++){
            ans[i] = res.get(i);
        }
        return ans;
    }
}