class Solution {
    public long gcdSum(int[] nums) {
        
        int n = nums.length;
        long[] prefixGcd = new long[n];
        long mx = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            mx = Math.max(mx , nums[i]);
            prefixGcd[i] = gcd(nums[i] , mx);
        }

        Arrays.sort(prefixGcd);

        int s = 0 , l = n-1;

        long sum = 0;

        while(s < l){
            sum += gcd(prefixGcd[s] , prefixGcd[l]);
            s++;
            l--;
        }

        return sum;
    }

    public long gcd(long a, long b){
        while(b != 0){
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}