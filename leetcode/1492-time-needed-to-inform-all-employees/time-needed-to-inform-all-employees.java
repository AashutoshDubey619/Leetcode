class Solution {

    class Pair {
        int node, time;

        Pair(int node, int time) {
            this.node = node;
            this.time = time;
        }
    }

    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());

        for (int i = 0; i < n; i++) {
            if (manager[i] != -1) {
                adj.get(manager[i]).add(i);
            }
        }

        
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(headID, 0));

        int maxTime = 0;

        while (!q.isEmpty()) {
            Pair curr = q.poll();

            int node = curr.node;
            int time = curr.time;

            maxTime = Math.max(maxTime, time);

            for (int child : adj.get(node)) {
                q.add(new Pair(child, time + informTime[node]));
            }
        }

        return maxTime;
    }
}