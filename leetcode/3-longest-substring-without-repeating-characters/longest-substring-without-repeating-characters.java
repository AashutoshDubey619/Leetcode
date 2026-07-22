class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashSet<Character> set = new HashSet<>();
        int longest = 1;

        if(s.length() == 0)return 0;

        int i = 0 , j = 0;

        while(j < s.length()){
            
            while(!set.add(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }

            longest = Math.max(longest , j - i + 1);
            
            j++;
        }

        return longest;
    }
}