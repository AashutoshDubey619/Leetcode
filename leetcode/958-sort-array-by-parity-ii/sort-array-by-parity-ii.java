class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] res = new int[nums.length];

        int i = 0;
        int j = 1;
        int k = 0;

        while(k < nums.length){
            if(nums[k] % 2 == 0){
                res[i] = nums[k];
                i += 2;
            }
            else if(nums[k] % 2 != 0){
                res[j] = nums[k];
                j += 2;
            }
            k++;
        }

        return res;
    }
}