class KthLargest {
    PriorityQueue<Integer> pq;
    int k;
    int[] nums;

    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<>();   
        this.k = k;     
        this.nums = nums;

        for(int x : nums){
            pq.add(x);

            if(pq.size() > k)pq.poll();
        }
    }
    
    public int add(int val) {
        pq.add(val);

        while(pq.size() > k)pq.poll();

        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */