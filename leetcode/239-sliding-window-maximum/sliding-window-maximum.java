class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        if(nums.length == 1)return nums;
        int[] res = new int[nums.length-k+1];

        ArrayDeque<Integer> dq = new ArrayDeque<>();

        for(int i=0;i<k;i++){
            while(!dq.isEmpty() && nums[i] > dq.peekLast()){
                dq.pollLast();
            }
            dq.addLast(nums[i]);
        }

        res[0] = dq.peekFirst();

        int i = 0;
        int j = k;

        while(j < nums.length){
            while(!dq.isEmpty() && nums[j] > dq.peekLast()){
                dq.pollLast();
            }
            dq.addLast(nums[j]);

            if(nums[i] == dq.peekFirst()){
                dq.pollFirst();
            }

            i++;
            
            res[i] = dq.peekFirst();

            j++;
        }

        return res;
    }
}