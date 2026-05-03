class Solution {
    public int[] countOppositeParity(int[] nums) {
        
        int[] ans = new int[nums.length];

        for(int i=0;i<nums.length-1;i++){
            int count = 0;

            for(int j=i+1;j<nums.length;j++){
                if((nums[i] % 2 == 0 && nums[j] % 2 != 0) || (nums[i] % 2 != 0 && nums[j] % 2 == 0))count++;
            }

            ans[i] = count;
        }

        ans[ans.length-1] = 0;

        return ans;
    }
}