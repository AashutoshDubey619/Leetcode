class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        
       int inc_len = 1;
       int dec_len = 1;

        int n = nums.length;

        int l = 0 , r = 1;

        for(int i=1;i<n;i++){
            int len = 1;
                while(i < n && nums[i] > nums[i-1]){
                    len++;
                    inc_len = Math.max(inc_len , len);
                    i++;
                }
        }

        for(int i=0;i<n-1;i++){
            int len = 1;
                while(i < n-1 && nums[i] > nums[i+1]){
                    len++;
                    dec_len = Math.max(dec_len , len);
                    i++;
                }
        }

        return Math.max(inc_len , dec_len);
    }
}