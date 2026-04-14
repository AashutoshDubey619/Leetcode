class Solution {
    public int getMinDistance(int[] nums, int target, int start) {

        int l = start;
        int r = start;

        int ldist = 0;
        int rdist = 0;

        while(l >= 0 || r < nums.length){

            if(l >= 0){
                if(nums[l] == target){
                    ldist = Math.abs(l - start);
                    return ldist;
                }
                l--;
            }

            if(r < nums.length){
                if(nums[r] == target){
                    rdist = Math.abs(r - start);
                    return rdist;
                }
                r++;
            }
        }

        return -1;
    }
}