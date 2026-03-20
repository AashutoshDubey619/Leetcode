class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;

        int[][] presuffpdt = new int[n][2];
        int [] ans = new int[n];

        int prefixpdt = 1 , suffixpdt = 1;

        for(int i=0;i<n;i++){
            prefixpdt *= nums[i];
            presuffpdt[i][0] = prefixpdt; 
        }

        for(int i=n-1;i>=0;i--){
            suffixpdt *= nums[i];
            presuffpdt[i][1] = suffixpdt; 
        }
        
        ans[0] = presuffpdt[1][1];
        ans[n-1] = presuffpdt[n-2][0];
        
        for(int i=1;i<n-1;i++){
            ans[i] = presuffpdt[i-1][0] * presuffpdt[i+1][1];
        }

        return ans;
    }
}