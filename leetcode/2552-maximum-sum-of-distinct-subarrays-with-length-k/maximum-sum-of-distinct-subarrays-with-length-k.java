class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>(); 
        long Max_Sum = 0;
        long sum = 0;
        int dups = 0;

        
        for (int i = 0; i < k; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            if (map.get(nums[i]) == 2) dups++; 
            sum += nums[i];
        }

        if (dups == 0) {
            Max_Sum = sum;
        }

        
        for (int i = k; i < nums.length; i++) {
            int addnum = nums[i];
            int removenum = nums[i - k];

            
            map.put(addnum, map.getOrDefault(addnum, 0) + 1);
            if (map.get(addnum) == 2) dups++;
            sum += addnum;

           
            map.put(removenum, map.get(removenum) - 1);
            if (map.get(removenum) == 1) dups--;
            sum -= removenum;

            if (dups == 0) {
                Max_Sum = Math.max(Max_Sum, sum);
            }
        }

        return Max_Sum;
    }
}