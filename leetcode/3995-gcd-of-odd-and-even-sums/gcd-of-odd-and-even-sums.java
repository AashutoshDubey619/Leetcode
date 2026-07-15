class Solution {
    public int gcdOfOddEvenSums(int n) {
        
        int sumOdd = 0 , sumEven = 0;
        int e = 2 , o = 1;


        for(int i=1;i<=n;i++){
                sumEven += e;
                e += 2;
           
                sumOdd += o;
                o += 2;       
        }

       return gcd(sumOdd , sumEven);
    }

    public int gcd(int a , int b){
        if(a == b)return a;

        int i = 2; 
        int res = 1;

        int min = -1;
        if(a > b)min = b;
        else min = a;

        while(i <= min){
            if(a % i == 0 && b % i == 0)res = i;
            i++;
        }

        return res;
    }
}