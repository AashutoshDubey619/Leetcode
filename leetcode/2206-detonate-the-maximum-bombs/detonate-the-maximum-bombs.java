class Solution {
    public int maximumDetonation(int[][] bombs) {
        
            int n = bombs.length;
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();

            for(int i = 0; i < n; i++) {
                list.add(new ArrayList<>());
            }

            for(int i = 0; i < n; i++){
                int x1 = bombs[i][0];
                int y1 = bombs[i][1];
                int r  = bombs[i][2];

                for(int j = 0; j < n; j++){
                    if(i == j) continue;

                    int x2 = bombs[j][0];
                    int y2 = bombs[j][1];

                    long dx = x1 - x2;
                    long dy = y1 - y2;

                    if(dx*dx + dy*dy <= (long)r*r){
                        list.get(i).add(j);
                    }
                }
            }

        int max_bombs = Integer.MIN_VALUE;


        for(int i=0;i<n;i++){
            max_bombs = Math.max(max_bombs , bfs(i , list , n));
        }

        return max_bombs;
    }

    public int bfs(int i , ArrayList<ArrayList<Integer>> list , int n){

        Queue<Integer> q = new LinkedList<>();

        boolean[] detonated = new boolean[n];
        detonated[i] = true;

        int bombs = 0;

        q.add(i);

        while(q.size() > 0){
            int bomb = q.poll();

            bombs++;

            for(int bum : list.get(bomb)){
                if(!detonated[bum]){
                    detonated[bum] = true;
                    q.add(bum);
                }
            }
        }

        return bombs;
    }
}