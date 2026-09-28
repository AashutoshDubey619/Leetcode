class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int[] freq = new int[101];

        for(int x : nums)freq[x]++;

        int[] ans = new int[nums.length];

        int k = 0;

       while(k < nums.length) {
            for(int i = 0; i < 101; i++) {
                if(freq[i] > 0) {
                    ans[k++] = i;
                    freq[i]--;
                }
            }
        }

        return ans;
    }
}