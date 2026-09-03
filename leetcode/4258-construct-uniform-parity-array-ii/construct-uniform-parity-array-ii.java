class Solution {
    public boolean uniformArray(int[] nums1) {

        int minOdd = Integer.MAX_VALUE;

        boolean hasOdd = false;

        for(int n : nums1){
            if(n % 2 != 0){
                hasOdd = true;
                minOdd = Math.min(minOdd , n);
            }
        }

        if(!hasOdd)return true;

        for(int n : nums1){
            if(n % 2 == 0){
                if(n <= minOdd)return false;
            }
        }

        return true;
    }
}