class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] visited = new boolean[n];

        bfs(0, visited, rooms);

        for(int i = 0; i < n; i++){
            if(!visited[i]) return false;
        }

        return true;
    }

    public void bfs(int start, boolean[] visited, List<List<Integer>> rooms){
        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        visited[start] = true;

        while(!q.isEmpty()){
            int front = q.remove();

            for(int key : rooms.get(front)){
                if(!visited[key]){
                    visited[key] = true;
                    q.add(key);
                }
            }
        }
    }
}