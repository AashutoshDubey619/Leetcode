class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        
        HashMap<Integer , Integer> map = new HashMap<>();
        
        int max_freq = 0;
        int i =0;
        int j =0;
        int longest = 0;

        while(j < nums.length){
            map.put(nums[j] , map.getOrDefault(nums[j] , 0)+1);
            
            max_freq = Math.max(max_freq , map.get(nums[j]));

            while(max_freq > k){
                if(max_freq == map.get(nums[i])){
                    max_freq = map.get(nums[i])-1;
                }
                map.put(nums[i] , map.get(nums[i])-1);
                i++;
            }

            longest = Math.max(longest , j-i+1);

            j++;
        }

        return longest;
    }
}
