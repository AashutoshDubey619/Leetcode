class Solution {
    public long sumAndMultiply(int n) {
        
        long x = 0 , sum = 0;
        long x2 = 0;

        ArrayList<Integer> list = new ArrayList<>();

        while(n > 0){
            if(n % 10 != 0){
                x = x * 10 + (n % 10);
                sum += n % 10;
            }
            n /= 10;
        }

        while(x > 0){
                x2 = x2 * 10 + (x % 10);
                x /= 10;
        }

        return x2 * sum;
    }
}