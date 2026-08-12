class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        
        HashMap<Integer , Integer> map = new HashMap<>();
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        int i =0;
        int j =0;
        int longest = 0;

        while(j < nums.length){
            map.put(nums[j] , map.getOrDefault(nums[j] , 0)+1);
            
            while(!dq.isEmpty() && dq.getLast() < map.get(nums[j])){
                dq.pollLast();
            }
            dq.addLast(map.get(nums[j]));

            while(dq.getFirst() > k){
                if(map.get(nums[i]) == dq.peekFirst()){
                    map.put(nums[i] , map.get(nums[i])-1);
                    dq.pollFirst();
                    dq.addLast(map.get(nums[i]));
                }
                else map.put(nums[i] , map.get(nums[i])-1);
                i++;
            }

            longest = Math.max(longest , j-i+1);

            j++;
        }

        return longest;
    }
}
