class Solution {
    public boolean checkDivisibility(int n) {
        
        int sum = 0 , pdt = 1;

        int x = n;

        while(x > 0){
            sum += x % 10;
            pdt *= x % 10;
            x /= 10;
        }

        return n % (sum+pdt) == 0;
    }
}