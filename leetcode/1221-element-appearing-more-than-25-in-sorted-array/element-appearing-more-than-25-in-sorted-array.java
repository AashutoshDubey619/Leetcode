class Solution {
    public int findSpecialInteger(int[] arr) {
         
        int freq[] = new int[100001];
        double r_f = (0.25)*(arr.length);

        for(int x : arr)freq[x]++;
        
        for(int x : arr)if(freq[x] > r_f)return x;

        return -1;
    }
}