class Solution {
    public int minOperations(int[][] grid, int x) {
        
        int m = grid.length;
        int n = grid[0].length;


        int ops = 0;

        int arr[] = new int[m*n];
        int k = 0;
        if(m == 1 && n == 1)return 0;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[k++] = grid[i][j];
            }
        }

        Arrays.sort(arr);

        int mid = arr.length / 2;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > arr[mid]){
                if((arr[i]-arr[mid])%x != 0)return -1;
                
                ops += (arr[i] - arr[mid])/x;
            }
            if(arr[i] < arr[mid]){
                if((arr[mid]-arr[i])%x != 0)return -1;
                
                ops += (arr[mid] - arr[i])/x;
            }
        }

        return ops;

    }
}