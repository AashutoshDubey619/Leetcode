class Solution {
    public int longestSubarray(int[] nums, int limit) {
        
        Deque<Integer> maxDeque = new ArrayDeque<>();
        Deque<Integer> minDeque = new ArrayDeque<>();

        int i = 0;
        int j = 0;
        int val = 0;
        int longest = 0;

        while(j < nums.length){

            while(!maxDeque.isEmpty() && nums[j] > nums[maxDeque.peekLast()]){
                maxDeque.pollLast();
            }
            maxDeque.addLast(j);

            while(!minDeque.isEmpty() && nums[j] < nums[minDeque.peekLast()]){
                minDeque.pollLast();
            }
            minDeque.addLast(j);

            val = Math.abs(nums[maxDeque.peekFirst()] - nums[minDeque.peekFirst()]);


            while(val > limit){
                if(i == maxDeque.peekFirst()){
                    maxDeque.pollFirst();
                    val = Math.abs(nums[maxDeque.peekFirst()] - nums[minDeque.peekFirst()]);
                }
                if(i == minDeque.peekFirst()){
                    minDeque.pollFirst();
                    val = Math.abs(nums[maxDeque.peekFirst()] - nums[minDeque.peekFirst()]);
                }
                i++;
            }

            longest = Math.max(longest , j-i+1);

            j++;

        }

        return longest;
    }
}