class Solution {
    public List<Integer> findLonely(int[] nums) {
        
        List<Integer> res = new ArrayList<>();

        int n = nums.length;

        if(n == 1){
            res.add(nums[0]);
            return res;
        }

        int[] freq = new int[10000000];

        for(int x : nums)freq[x]++;

        for(int x : nums){
            if(x == 0 && freq[x] == 1 && freq[x+1] == 0)res.add(x);
            else if(x == 1000001 && freq[x] == 1 && freq[x-1] == 0)res.add(x);
            else if(x > 0 && x < 1000001 && freq[x] == 1 && freq[x-1] == 0 && freq[x+1] == 0)res.add(x);
        }
        
        return res;
    }
}