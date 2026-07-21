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
            return b.v - a.v;
        });

        for(int x : nums)map.put(x , map.getOrDefault(x ,0)+1);

        for(int key : map.keySet()){
            pq.add(new Pair(key , map.get(key)));
        }

        int x = 0;

        while(k > 0){
            res[x++] = pq.poll().k;
            k--;
        }

        return res;
    }
}