class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;

        int[][] diff = new int[m][n];

        int[] onesRow = new int[m];
        int[] onesCol = new int[n];

        for(int i=0;i<m;i++){
            int ones = 0;

            for(int j=0;j<n;j++){
                if(grid[i][j] == 1)ones++;
            }

            onesRow[i] = ones;
        }

        for(int j=0;j<n;j++){
            int ones = 0;

            for(int i=0;i<m;i++){
                if(grid[i][j] == 1)ones++;
            }

            onesCol[j] = ones;
        }


        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                diff[i][j] = onesRow[i] + onesCol[j] - (n-onesRow[i]) - (m - onesCol[j]);
            }
        }

        return diff;
    }
}