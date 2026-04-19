class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int j = 0;

        int max_dist = Integer.MIN_VALUE;

        for(int i=0;i<nums1.length;i++){
            while(j < nums2.length && nums2[j] >= nums1[i]){
                max_dist = Math.max(max_dist , j - i);
                j++;
            }
            while(i > j) j++;
        }


        return (max_dist == Integer.MIN_VALUE || max_dist < 0) ? 0 : max_dist;
    }
}