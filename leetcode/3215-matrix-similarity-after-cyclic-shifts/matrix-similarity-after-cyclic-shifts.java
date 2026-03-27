class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;

        int[][] org = new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                org[i][j] = mat[i][j];
            }
        }

        k = k % n;

        for(int i=0;i<m;i++){
            if(i % 2 == 0){
                reverse(i ,0 , k-1 , mat);
                reverse(i ,k , n-1 , mat);
                reverse(i ,0 , n-1 , mat);
            }
            else{
                reverse(i ,0 , n-1 , mat);
                reverse(i ,0 , k-1 , mat);
                reverse(i ,k , n-1 , mat);
            }
        }
      
      for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(mat[i][j] != org[i][j])return false;
        }
      }

      return true;
    }

    public void reverse(int i , int l , int r , int[][] mat){
        while(l < r){
            int temp = mat[i][l];
            mat[i][l] = mat[i][r];
            mat[i][r] = temp;

            l++;
            r--;
        }
    }
}