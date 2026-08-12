class Solution {
    public int missingInteger(int[] nums) {
        
        int seqsum = nums[0];
        HashSet<Integer> set = new HashSet<>();

        for(int x : nums)set.add(x);
        int j = 0;

        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]+1){
                seqsum += nums[i];
                j++;
            }
            else break;
        }

        if(j == nums.length)return seqsum;

        while(set.contains(seqsum)){
            seqsum += 1;
        }

        return seqsum;
    }
}