class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        ArrayList<Integer> res = new ArrayList<>();

        PriorityQueue<Integer> pq = new PriorityQueue<>( (a , b)->{
            if(Math.abs(a - x) == Math.abs(b-x))return b-a;
            return Math.abs(b - x) - Math.abs(a-x);
        }
      );

       for(int el : arr){
            pq.offer(el);
            if(pq.size() > k){
                pq.poll();
            }
       }

       while(!pq.isEmpty()){
           res.add(pq.poll());
       }

       Collections.sort(res);

       return res;
    }
}