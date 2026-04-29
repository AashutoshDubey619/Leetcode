class Solution {
    public int countHomogenous(String s) {
        
        long count = 0;

        long MOD = 1000000000+7;

        int i = 0; 
        int j = 0;

        while(j < s.length()){
            char cj = s.charAt(j);
            char ci = s.charAt(i);

            if(cj != ci)i = j;

            count = (count + (j - i + 1)) % MOD;

            j++;
        }

        return (int)count;
    }
}