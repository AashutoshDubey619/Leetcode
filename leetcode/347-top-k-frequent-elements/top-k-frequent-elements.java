class Solution {
    class Pair{
        int k , v;
        Pair(int k , int v){
            this.k = k;
            this.v = v;
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        
        int[] res = new int[k];

        HashMap<Integer , Integer> map = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> {
            return a.v - b.v;
        });

        for(int x : nums)map.put(x , map.getOrDefault(x ,0)+1);

        for(int key : map.keySet()){
            pq.offer(new Pair(key , map.get(key)));
            if(pq.size() > k)pq.poll();
        }

        int x = 0;

        while(!pq.isEmpty()){
            res[x++] = pq.poll().k;
        }

        return res;
    }
}