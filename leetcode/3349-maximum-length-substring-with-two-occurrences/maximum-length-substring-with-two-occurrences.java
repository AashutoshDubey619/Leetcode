class Solution {
    public int maximumLengthSubstring(String s) {
        
        int[] freq = new int[26];

        int longest = 0;

        int i = 0, j = 0;

        while(j < s.length()){

            freq[s.charAt(j)-'a']++;

            while(freq[s.charAt(j)-'a'] > 2){
                freq[s.charAt(i)-'a']--;
                i++;
            }

            longest = Math.max(longest , j-i+1);

            j++;
        }   

        return longest;

    }
}