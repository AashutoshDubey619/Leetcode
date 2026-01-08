class Solution {
    public int search(int[] nums, int target) {
        return bs(nums, 0, nums.length - 1, target);
    }

    public int bs(int[] nums, int l, int r, int target) {
        if (l > r) return -1;   

        int m = l + (r - l) / 2;

        if (nums[m] == target) {
            return m;
        } 
        else if (nums[m] < target) {
            return bs(nums, m + 1, r, target);
        } 
        else {
            return bs(nums, l, m - 1, target);
        }
    }
}
