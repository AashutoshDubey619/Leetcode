class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        int r = accounts.length;
        int c = accounts[0].length;

        for(int i=0;i<r;i++){

            int sum = 0;

            for(int j=0;j<c;j++){
                sum += accounts[i][j];
            }

            max = Math.max(max , sum);
        }

        return max;
    }
}