class Solution {
    public boolean validDigit(int n, int x) {
        
        boolean flag = false;

        while(n > 0){
            if((n/10 !=0) && (n % 10 == x))flag = true;
            else if((n/10 ==0) && (n % 10 == x))flag = false;
            n /= 10; 
        }

        return flag;
    }
}