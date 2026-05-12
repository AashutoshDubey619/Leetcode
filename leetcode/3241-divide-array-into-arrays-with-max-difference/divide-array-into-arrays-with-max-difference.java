class Solution {
    public int[][] divideArray(int[] nums, int k) {
        
        int n = nums.length;

        Arrays.sort(nums);

        int [][] res = new int[n/3][3];

        int i = 0;
        int j = 2;


        while(j < nums.length){
            if((nums[j] - nums[i]) > k){
                return new int[][]{};
            }
            i+=3;
            j+=3;
        }

            int s = 0;

            for(int a=0;a<n/3;a++){
                for(int b=0;b<3;b++){
                    res[a][b] = nums[s++];
                }
            }

        return res;
    }
}