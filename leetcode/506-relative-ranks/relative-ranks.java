class Solution {
    class Pair {
        int idx, sc;

        Pair(int idx, int sc) {
            this.idx = idx;
            this.sc = sc;
        }
    }

    public String[] findRelativeRanks(int[] score) {
        
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a, b) -> b.sc - a.sc
        );

        for (int i = 0; i < score.length; i++) {
            pq.add(new Pair(i, score[i]));
        }

        String[] res = new String[score.length];
        int rank = 1;

        while (!pq.isEmpty()) {
            Pair p = pq.poll();
            int idx = p.idx;

            if (rank == 1) res[idx] = "Gold Medal";
            else if (rank == 2) res[idx] = "Silver Medal";
            else if (rank == 3) res[idx] = "Bronze Medal";
            else res[idx] = String.valueOf(rank);

            rank++;
        }

        return res;
    }
}