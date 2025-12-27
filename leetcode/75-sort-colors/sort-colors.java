class Solution {
    public void sortColors(int[] nums) {

        int[] freq = new int[3];

        for(int x : nums){
            freq[x]++;
        }

        int idx = 0;
        for(int color = 0; color < 3; color++){
            while(freq[color]-- > 0){
                nums[idx++] = color;
            }
        }
    }
}
