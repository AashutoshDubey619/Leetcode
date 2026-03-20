class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        String res = "";

        int i = 0 , j = 0 , k = 0;
        
        int min_len = Math.min(word1.length() , word2.length());

        while(k < min_len){
            res+= word1.charAt(i);
            i++;
            res+=word2.charAt(j);
            j++;

            k++;
        }

        while(i < word1.length()){
            res+= word1.charAt(i);
            i++;
        }
        while(j < word2.length()){
            res+= word2.charAt(j);
            j++;
        }

        return res;
    }
}