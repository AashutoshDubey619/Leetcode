class Solution {
    public int trailingZeroes(int n) {
        
        if(n < 5)return 0;

        int sum = 0;

        while(n > 0){
            sum += n / 5;
            if((n / 5)<5)break;
            n /= 5;
        }

        return sum;
    }
}