class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }

        int indegree[] = new int[numCourses];

        for(int i=0;i<prerequisites.length;i++){
            int u = prerequisites[i][0];
            int v = prerequisites[i][1];

            adj.get(u).add(v);
            indegree[v]++;
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<numCourses;i++){
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

        
        return !(res.size() < numCourses);
    }
}