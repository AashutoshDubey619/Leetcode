class Solution {
    public int lengthOfLongestSubstring(String s) {

        int max_len = 0;
        int i = 0;
        HashSet<Character> set = new HashSet<>();
        int j = 0;
        
        while(j < s.length()){
          if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
            max_len = Math.max(max_len , j - i + 1);
            j++;
            }
            else{   
                set.remove(s.charAt(i));
                i++;
            }
        }

        return max_len;

    }
}