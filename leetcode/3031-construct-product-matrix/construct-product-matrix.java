class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        
        int n = grid.length;
        int m = grid[0].length;
        int MOD = 12345;

        int[] arr = new int[n * m];
        int k = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[k++] = grid[i][j] % MOD; 
            }
        }

        int l = arr.length;

        int[] res = new int[l];

        int pref = 1;
        for(int i = 0; i < l; i++){
            res[i] = pref;
            pref = (int)((1L * pref * arr[i]) % MOD);  
        }

        int suff = 1;
        for(int i = l - 1; i >= 0; i--){
            res[i] = (int)((1L * res[i] * suff) % MOD);
            suff = (int)((1L * suff * arr[i]) % MOD);  
        }

        k = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                grid[i][j] = res[k++];
            }
        }

        return grid;
    }
}