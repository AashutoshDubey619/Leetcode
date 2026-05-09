class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        int l = 0;
        int r = arr.length - 1;

        while(l <= r){
            int m = l + (r-l)/2;

            if(m > 0 && m < arr.length && arr[m] > arr[m+1] && arr[m] > arr[m-1])return m;
            else if(m > 0 &&  arr[m-1] > arr[m])r = m-1;
            else l = m + 1;
        }

        return 0;
    }
}