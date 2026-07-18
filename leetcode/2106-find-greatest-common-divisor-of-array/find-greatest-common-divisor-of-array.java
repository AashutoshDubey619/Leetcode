class Solution {
    public int findGCD(int[] nums) {
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int x : nums){
            min = Math.min(min , x);
            max = Math.max(max , x);
        }

        return gcd(min , max);
    }

    public int gcd(int a , int b){
        
        if(a == b)return a;

        int min = -1;

        if(a > b)min = b;
        else min = a;

        int gcd = 1;

        for(int i=2;i<=min;i++){
            if(a % i == 0 && b % i == 0)gcd = i;
        }

        return gcd;
    }
}