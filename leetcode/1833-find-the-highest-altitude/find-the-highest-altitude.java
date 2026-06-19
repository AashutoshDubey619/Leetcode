class Solution {
    public int largestAltitude(int[] gain) {
        
        int max = 0;

        int psum = 0;

        for(int i=0;i<gain.length;i++){
            psum += gain[i];

            max = Math.max(max , psum);
        }

        return max;
    }
}