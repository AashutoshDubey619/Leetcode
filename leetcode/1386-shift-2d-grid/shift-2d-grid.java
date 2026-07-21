class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        
        List<List<Integer>> res = new ArrayList<>();

        int m = grid.length;
        int n = grid[0].length;
        int len = m * n;

        int[] flatarr = new int[len];

         k = k % len;

        int x = 0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                flatarr[x++] = grid[i][j];
            }
        }

        reverse(0 , len -1 , flatarr);
        reverse(0 , k-1 , flatarr);
        reverse(k , len-1 , flatarr);

        int y =0;

        for(int i = 0; i < m; i++){
                res.add(new ArrayList<>());
                for(int j = 0; j < n; j++){
                    res.get(i).add(flatarr[y++]);
                }
        }
        
        return res;
    }

    public void reverse(int l , int r , int[] flatarr){
        while(l < r){
            int temp = flatarr[l];
            flatarr[l] =flatarr[r];
            flatarr[r] = temp;
            l++;
            r--;
        }
    }
}