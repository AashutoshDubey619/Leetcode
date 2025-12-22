class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int row = matrix.length;
        int col = matrix[0].length;

        for(int i = 0; i < row; i++){
            int l = 0;
            int r = col - 1;

            while(l <= r){
                int m = l + (r - l) / 2;

                if(matrix[i][m] == target){
                    return true;
                }
                else if(matrix[i][m] < target){
                    l = m + 1;
                }
                else{
                    r = m - 1;
                }
            }
        }
        return false;
    }
}
