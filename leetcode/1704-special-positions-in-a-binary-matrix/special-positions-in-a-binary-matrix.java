class Solution {
    public int numSpecial(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;
        int rowsum[] = new int[m];
        int colsum[] = new int[n];
        int count = 0;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                rowsum[i] += mat[i][j];
                colsum[j] += mat[i][j];
            }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(mat[i][j] == 1 && rowsum[i] == 1 && colsum[j] == 1){
                    count++;
                }
            }
        }

        return count;
    }
}