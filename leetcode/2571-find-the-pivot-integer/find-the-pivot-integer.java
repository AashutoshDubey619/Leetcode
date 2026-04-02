class Solution {
    public int pivotInteger(int n) {
        
        int[] prefix = new int[n+1];

        int pre = 0;
        for(int i=1;i<n+1;i++){
            pre += i;
            prefix[i] = pre;
        }

        int suf = 0;
        for(int i=n;i>=0;i--){
            suf += i;
            if(suf == prefix[i])return i;
        }

        return -1;
    }
}