class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length == 0)return 0;

        HashSet<Integer> set = new HashSet<>();
        int len = 1;

        for(int x : nums)set.add(x);

        for(int it : set){
            if(set.contains(it - 1))continue;
            int count = 1;
            int x = it;
            while(set.contains(x + 1)){
                count++;
                x = x + 1;
            }
            len = Math.max(len , count);
        }

        return len;
    }
}