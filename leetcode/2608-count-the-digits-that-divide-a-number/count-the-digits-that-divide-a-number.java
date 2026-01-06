class Solution {
    public int countDigits(int num) {
        
        int count = 0;
        int x = num;

        while(x > 0){
            int ld = x % 10;
            if(num % ld == 0) count++;
            x/= 10;
        }

        return count;
    }
} 