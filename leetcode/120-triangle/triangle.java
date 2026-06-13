class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        
        int[][] dp = new int[triangle.size()][triangle.get(triangle.size()-1).size()];

        for(int d[] : dp)Arrays.fill(d , Integer.MAX_VALUE/2);

        int m = triangle.size();
        
        return min_path(0 , 0  , triangle , dp);
    }

    public int min_path(int r , int i , List<List<Integer>> triangle ,int[][] dp){

        if(r == triangle.size())return 0;

        if(dp[r][i] != Integer.MAX_VALUE/2)return dp[r][i];

        int ith = triangle.get(r).get(i) + min_path(r+1 , i ,triangle , dp);

        int iplusoneth = triangle.get(r).get(i) + min_path(r+1 , i+1 ,triangle , dp);

        return dp[r][i] = Math.min(ith , iplusoneth);
    }
}