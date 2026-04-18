class Solution {
    public int mirrorDistance(int n) {
        
        int rev = 0;
        int x = n;

        while(x > 0){
            int ld = x % 10;
            rev =  rev*10 + ld;
            x/=10;
        }

        return Math.abs(n - rev);
    }
}