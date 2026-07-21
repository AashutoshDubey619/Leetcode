class Solution {
    public boolean isAnagram(String s, String t) {
        
        int[] freq = new int[26];

        for(char c : s.toCharArray())freq[c-'a']++;

        for(char c : t.toCharArray()){
            if(freq[c-'a']==0)return false;
            freq[c-'a']--;
        }

        boolean flag = true;
        for(int i=0;i<26;i++){
            if(freq[i] > 0)return false;
        }

        return true;
    }
}