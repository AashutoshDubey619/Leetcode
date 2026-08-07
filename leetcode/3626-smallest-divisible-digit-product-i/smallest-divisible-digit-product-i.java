class Solution {
    public int smallestNumber(int n, int t) {
        
        for(int i=n;i<=101;i++){
            int x = i;
            int p = 1;

            while(x > 0){
                p *= x % 10;
                x /= 10;
            }

            if(p % t == 0)return i;
        }
        
        return -1;
    }
}