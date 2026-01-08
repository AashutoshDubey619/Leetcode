class Solution {

    public int[] searchRange(int[] nums, int target) {

        int first = findFirst(nums, target, 0, nums.length - 1);
        int last  = findLast(nums, target, 0, nums.length - 1);

        return new int[]{ first, last };
    }

    private int findFirst(int[] nums, int target, int l, int r) {
        if (l > r) return -1;

        int m = l + (r - l) / 2;

        if (nums[m] == target) {
            int left = findFirst(nums, target, l, m - 1);
            return (left != -1) ? left : m;
        }
        else if (nums[m] < target) {
            return findFirst(nums, target, m + 1, r);
        }
        else {
            return findFirst(nums, target, l, m - 1);
        }
    }

    private int findLast(int[] nums, int target, int l, int r) {
        if (l > r) return -1;

        int m = l + (r - l) / 2;

        if (nums[m] == target) {
            int right = findLast(nums, target, m + 1, r);
            return (right != -1) ? right : m;
        }
        else if (nums[m] < target) {
            return findLast(nums, target, m + 1, r);
        }
        else {
            return findLast(nums, target, l, m - 1);
        }
    }
}
