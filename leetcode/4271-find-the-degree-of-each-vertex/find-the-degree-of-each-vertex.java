class Solution {
    public int[] findDegrees(int[][] matrix) {
        
        int n = matrix.length;

        int[] dihgree = new int[n];

        for(int i=0;i<n;i++){
            int dih = 0;

            for(int j=0;j<n;j++){
                if(matrix[i][j] == 1)dih++;
            }

            dihgree[i] = dih;
        }

        return dihgree;
    }
}