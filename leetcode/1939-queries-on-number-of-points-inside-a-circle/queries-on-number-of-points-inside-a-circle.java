class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        
        int m = queries.length;
        int n = points.length;

        int[] ans = new int[m];

        for(int i = 0; i < m; i++){
            int x1 = queries[i][0];
            int y1 = queries[i][1];
            int r = queries[i][2];
            
            int count = 0;

            for(int j = 0; j < n; j++){
                int x2 = points[j][0];
                int y2 = points[j][1];

                int dx = (x2 - x1) * (x2 - x1);
                int dy = (y2 - y1) * (y2 - y1);
                
                if(dx + dy <= r * r) count++;
            }

            ans[i] = count;
        }

        return ans;
    }
}