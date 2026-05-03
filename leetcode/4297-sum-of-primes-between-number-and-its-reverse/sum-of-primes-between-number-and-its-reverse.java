class Solution {
    public int sumOfPrimesInRange(int n) {
        
        int x = n ;
        int rev = 0;

        while(x > 0){
            int ld = x % 10;
            rev = (rev*10) + ld;
            x /= 10;
        }

        int start = Math.min(n , rev);
        int end = Math.max(n , rev);

        int sum = 0;

        for(int i=start;i<=end;i++){
            boolean isPrime = true;
            
            if(i == 1)continue;

            for(int j=2;j<i;j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime)sum += i;
        }

        return sum;
    }
}