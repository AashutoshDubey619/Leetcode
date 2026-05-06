class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        
        int m = boxGrid.length;
        int n = boxGrid[0].length;

        for(int i=0;i<m;i++){
            for(int j=n-1;j>=0;j--){
                int k = j;

                if(boxGrid[i][k] == '#'){
                    boxGrid[i][k] = '.';
                    while(k < n-1 && boxGrid[i][k+1] == '.'){
                        k++;
                    }
                    boxGrid[i][k] = '#';
                }
            }
        }

        char rotatedBox[][] = new char[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                rotatedBox[i][j] = boxGrid[m-1-j][i];
            }
        }

        return rotatedBox;
    }
}