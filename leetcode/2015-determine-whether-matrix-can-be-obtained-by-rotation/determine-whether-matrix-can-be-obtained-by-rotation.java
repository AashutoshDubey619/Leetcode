class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        
        return rotate(mat , target) || rotate(mat , target) || rotate(mat , target) || rotate(mat , target);
    }

    public boolean rotate(int[][] mat , int[][] target){
        int m = mat.length;
        int n = mat[0].length;

       for(int i = 0; i < m; i++){
            for(int j = i + 1; j < n; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        for(int i=0;i<m;i++){
            int l = 0;
            int r = m-1;

            while(l < r){
                int temp = mat[i][l];
                mat[i][l] = mat[i][r];
                mat[i][r] = temp;

                l++;
                r--;
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j] != target[i][j])return false;
            }
        }

        return true;
    }
}