class Solution {
    public void setZeroes(int[][] matrix) {

        int r = matrix.length;
        int c = matrix[0].length;

        HashSet<Integer> zeroRows = new HashSet<>();
        HashSet<Integer> zeroCols = new HashSet<>();

       
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j] == 0){
                    zeroRows.add(i);
                    zeroCols.add(j);
                }
            }
        }

        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(zeroRows.contains(i) || zeroCols.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
