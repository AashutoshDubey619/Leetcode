class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {

        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();

        for(int i=0;i<n;i++)
            adj.add(new ArrayList<>());

        for(int[] e : edges){
            adj.get(e[0]).add(new int[]{e[1], e[2]});
            adj.get(e[1]).add(new int[]{e[0], e[2]});
        }

        int min = Integer.MAX_VALUE;
        int city = -1;

        for(int i=0;i<n;i++){

            int[] dist = new int[n];
            Arrays.fill(dist, Integer.MAX_VALUE);

            PriorityQueue<int[]> pq =
                new PriorityQueue<>((a,b)->a[1]-b[1]);

            pq.offer(new int[]{i,0});
            dist[i] = 0;

            while(!pq.isEmpty()){

                int[] cur = pq.poll();
                int node = cur[0];
                int d = cur[1];

                for(int[] nei : adj.get(node)){

                    int next = nei[0];
                    int w = nei[1];

                    if(d + w < dist[next]){
                        dist[next] = d + w;
                        pq.offer(new int[]{next, dist[next]});
                    }
                }
            }

            int count = 0;

            for(int j=0;j<n;j++){
                if(i != j && dist[j] <= distanceThreshold)
                    count++;
            }

            if(count <= min){
                min = count;
                city = i;
            }
        }

        return city;
    }
}