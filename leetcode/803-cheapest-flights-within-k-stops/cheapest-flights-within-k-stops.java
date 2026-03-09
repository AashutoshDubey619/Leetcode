class Solution {

    class Pair{
        int node;
        int cost;

        Pair(int node,int cost){
            this.node=node;
            this.cost=cost;
        }
    }

    class Triplet{
        int stops,node,cost;

        Triplet(int stops,int node,int cost){
            this.stops=stops;
            this.node=node;
            this.cost=cost;
        }
    }

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {

        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();

        for(int i=0;i<n;i++) adj.add(new ArrayList<>());

        for(int[] f : flights){
            adj.get(f[0]).add(new Pair(f[1],f[2]));
        }

        int[] dist = new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);

        Queue<Triplet> q = new LinkedList<>();

        q.add(new Triplet(0,src,0));
        dist[src]=0;

        while(!q.isEmpty()){

            Triplet cur = q.poll();
            int stops = cur.stops;
            int node = cur.node;
            int cost = cur.cost;

            if(stops>k) continue;

            for(Pair it : adj.get(node)){

                int next = it.node;
                int price = it.cost;

                if(cost+price < dist[next] && stops<=k){

                    dist[next] = cost+price;
                    q.add(new Triplet(stops+1,next,cost+price));
                }
            }
        }

        return dist[dst]==Integer.MAX_VALUE ? -1 : dist[dst];
    }
}