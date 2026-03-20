class Solution {
    public int maxVowels(String s, int k) {
        
        int max = Integer.MIN_VALUE;
        
        int count = 0;

        for(int i=0;i<k;i++){
            char c = s.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')count++;
        }

        max = count;
        
        int i = 0;
        int j = k;

        while(j < s.length()){

            char cj = s.charAt(j);

            if(cj == 'a' || cj == 'e' || cj == 'i' || cj == 'o' || cj == 'u')count++;

            char ci = s.charAt(i);

            if(ci == 'a' || ci == 'e' || ci == 'i' || ci == 'o' || ci == 'u')count--;
            i++;

            j++;

            max = Math.max(max , count);
        }

        return max;
    }
}