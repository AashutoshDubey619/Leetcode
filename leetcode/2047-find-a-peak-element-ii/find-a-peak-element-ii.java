class Solution {
    public int[] findPeakGrid(int[][] mat) {

        int rows = mat.length;
        int cols = mat[0].length;

        for (int i = 0; i < rows; i++) {

            int l = 0, r = cols - 1;

            while (l < r) {
                int m = l + (r - l) / 2;

                if (mat[i][m] < mat[i][m + 1]) {
                    l = m + 1;
                } else {
                    r = m;
                }
            }

            int col = l;

            for (int j = 0; j < cols; j++) {
                if (mat[i][j] > mat[i][col]) {
                    col = j;
                }
            }

            if ((i == 0 || mat[i][col] > mat[i - 1][col]) &&
                (i == rows - 1 || mat[i][col] > mat[i + 1][col])) {
                return new int[]{i, col};
            }
        }

        return new int[]{-1, -1};
    }
}
