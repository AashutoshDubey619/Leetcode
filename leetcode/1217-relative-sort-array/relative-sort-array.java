class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
        int[] res = new int[arr1.length];

        int[] freq = new int[1001];

        for(int x : arr1)freq[x]++;

        int k = 0;
        for(int x : arr2){
                while(freq[x] > 0){
                    freq[x]--;
                    res[k++] = x;
                }
        }

        Arrays.sort(arr1);

        for(int x : arr1){
            if(freq[x] != 0){
                res[k++] = x;
                freq[x]--;
            }
        }
        

        return res;
    }
}