class Solution {
    public int[] replaceElements(int[] arr) {
        
        int n = arr.length;

        for(int i=0;i<n-1;i++){
            int max = Integer.MIN_VALUE;
            for(int j=i+1;j<n;j++){
               max = Math.max(max , arr[j]);
            }
            arr[i] = max;
        }

        arr[n-1] = -1;


        return arr;
    }
}