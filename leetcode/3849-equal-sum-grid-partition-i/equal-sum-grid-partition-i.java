class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;

        if(m == 1 && n == 1) return false;

        long total = 0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                total += grid[i][j];
            }
        }

        if(total % 2 != 0) return false;

        long half = total / 2;

       
        long[] rowSum = new long[m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                rowSum[i] += grid[i][j];
            }
        }

        long prefix = 0;
        for(int i=0;i<m-1;i++){
            prefix += rowSum[i];
            if(prefix == half) return true;
        }

        long[] colSum = new long[n];
        for(int j=0;j<n;j++){
            for(int i=0;i<m;i++){
                colSum[j] += grid[i][j];
            }
        }

        prefix = 0;
        for(int j=0;j<n-1;j++){
            prefix += colSum[j];
            if(prefix == half) return true;
        }

        return false;
    }
}