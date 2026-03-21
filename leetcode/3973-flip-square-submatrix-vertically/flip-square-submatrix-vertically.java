class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {

        for(int i = y; i < y + k; i++) {   
            
            int top = x;
            int down = x + k - 1;

            while(top < down) {
                int temp = grid[top][i];
                grid[top][i] = grid[down][i];
                grid[down][i] = temp;

                top++;
                down--;
            }
        }

        return grid;
    }
}