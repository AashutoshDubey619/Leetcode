class Solution {
    public String firstPalindrome(String[] words) {
        
        for(int i=0;i<words.length;i++){
            int j = 0;
            boolean palindrome = true;
            while(j < words[i].length()/2){
                if(!(words[i].charAt(j) == words[i].charAt(words[i].length()- 1 - j))){
                    palindrome = false;
                    break;
                }
                j++;
            }
            if(palindrome) return words[i];
        }

        return "";
    }
}