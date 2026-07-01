class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        
        int count = 0;

        for(int i=0;i<nums.length;i++){
            HashMap<Integer , Integer> map = new HashMap<>();

            for(int j=i;j<nums.length;j++){
                int len = j - i + 1;

                map.put(nums[j] , map.getOrDefault(nums[j],0)+1);

                if(map.containsKey(target))if(map.get(target) > (len/2))count++;

            }
        }

        return count;
    }
}