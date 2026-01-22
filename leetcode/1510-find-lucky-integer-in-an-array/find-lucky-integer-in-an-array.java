class Solution {
    public int findLucky(int[] arr) {
        
        int freq[] = new int[501];

        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        
        int max_lucky = -1;

        for(int i=1;i<501;i++){
            if(i == freq[i]){
                max_lucky = Math.max(max_lucky , i);
            }
        }

        return max_lucky;
    }
}