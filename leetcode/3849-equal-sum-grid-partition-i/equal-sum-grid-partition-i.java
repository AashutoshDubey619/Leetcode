class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;

        if(m == 1 && n == 1) return false;

        long total_sum = 0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                total_sum += grid[i][j];
            }
        }

        if(total_sum % 2 != 0) return false;

        long half = total_sum / 2;

        long rowprefsum = 0;
        for(int i=0;i<m-1;i++){
            long rowsum = 0;
            for(int j=0;j<n;j++){
                rowsum += grid[i][j];
            }
            rowprefsum += rowsum;
            if(rowprefsum == half) return true;
        }

        long colprefsum = 0;
        for(int j=0;j<n-1;j++){
            long colsum = 0;
            for(int i=0;i<m;i++){
                colsum += grid[i][j];
            }
            colprefsum += colsum;
            if(colprefsum == half) return true;
        }

        return false;
    }
}