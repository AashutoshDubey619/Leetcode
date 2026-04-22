class Solution {
    public int countDistinctIntegers(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();

        for(int n : nums)set.add(n);

        for(int i=0;i<nums.length;i++){
            int rev = 0;

            while(nums[i] > 0){
                int ld = nums[i] % 10;
                rev = rev * 10 + ld;
                nums[i] /= 10;
            }

            set.add(rev);
        }

        return set.size();
    }   
}