class Solution {
    class Triplet{
        int node , parent , dist;

        Triplet(int node, int parent , int dist){
            this.node = node;
            this.parent = parent;
            this.dist = dist;
        }
    }


    public int minCostConnectPoints(int[][] points) {
        int n = points.length;

        boolean[] vis = new boolean[n];

        PriorityQueue<Triplet> pq = new PriorityQueue<>(
            (a,b) ->{
            if(a.dist == b.dist) return a.node - b.node;
            return a.dist - b.dist; 
            }     
        );

        int sum = 0;

        pq.add(new Triplet(0 , -1 , 0));

        while(pq.size() > 0){
            Triplet top = pq.poll();

            int node = top.node , parent = top.parent , dist = top.dist;

            if(vis[node])continue;

            vis[node] = true;
            sum += dist;

            for(int i=0;i<n;i++){
                if(i == node || i == parent || vis[i]) continue;

                int x1 = points[node][0] , y1 = points[node][1];
                int x2 = points[i][0] , y2 = points[i][1];
                int minDist = Math.abs(x1 - x2) + Math.abs(y1 - y2);

                pq.add(new Triplet(i , node , minDist));
            }
        }
        return sum;
    }
}