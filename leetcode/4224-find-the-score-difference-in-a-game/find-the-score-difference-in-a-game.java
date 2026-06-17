class Solution {
    public int scoreDifference(int[] nums) {
        
        int f_score = 0 , s_score = 0;
        boolean first = true , sec = false;

        for(int i=0;i < nums.length;i++){
            if(nums[i] % 2 != 0){
                first = !first;
                sec = !sec;
            }
            if((i+1) % 6 == 0){
                first = !first;
                sec = !sec;
            }

            if(first)f_score += nums[i];
            if(sec)s_score += nums[i];
        }

        return f_score - s_score;
    }
}