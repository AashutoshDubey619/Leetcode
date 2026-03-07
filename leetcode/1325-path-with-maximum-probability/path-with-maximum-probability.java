class Solution {
    class Pair{
        int node;
        double prob;

        Pair(int node , double prob){
            this.node = node;
            this.prob = prob;
        }
    }

    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        List<List<Pair>> adj = new ArrayList<>();

        for(int i=0;i<n;i++) adj.add(new ArrayList<>());

        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];

            adj.get(u).add(new Pair(v , succProb[i]));
            adj.get(v).add(new Pair(u , succProb[i]));
        }

        double probs[] = new double[n];

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> Double.compare(b.prob , a.prob));

        pq.add(new Pair(start_node , 1));
        probs[start_node] = 1;

        while(pq.size() > 0){
            Pair top = pq.poll();

            if(top.prob < probs[top.node]) continue;

            for(Pair p : adj.get(top.node)){
                double total_prob = top.prob * p.prob;

                if(probs[p.node] < total_prob){
                    probs[p.node] = total_prob;
                    pq.add(new Pair(p.node , total_prob));
                }
            }
        }

        return probs[end_node];
    }
}