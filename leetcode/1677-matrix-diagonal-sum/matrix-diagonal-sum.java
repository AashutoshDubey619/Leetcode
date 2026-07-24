class Solution {
    public int diagonalSum(int[][] mat) {
        
        int sum = 0;

        int n = mat.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i == j)sum += mat[i][j];
                if(j == n-i-1 && i != j)sum += mat[i][j];
            }
        }

        return sum;
    }
}