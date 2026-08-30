class Solution {
    public int minimumDeletions(int[] nums) {

        int n = nums.length;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int min_idx = 0;
        int max_idx = 0;

        for (int i = 0; i < n; i++) {

            if (nums[i] < min) {
                min = nums[i];
                min_idx = i;
            }

            if (nums[i] > max) {
                max = nums[i];
                max_idx = i;
            }
        }

        int left = Math.min(min_idx, max_idx);
        int right = Math.max(min_idx, max_idx);

        int deleteFromFront = right + 1;

        int deleteFromBack = n - left;

        int deleteFromBothSides =
                (left + 1) + (n - right);

        return Math.min(
                deleteFromFront,
                Math.min(deleteFromBack, deleteFromBothSides)
        );
    }
}