class Solution {
    public int maxNumberOfBalloons(String text) {

        if(text.length() < 7)return 0;

        int [] freq = new int[26];

        for(char c : text.toCharArray())freq[c - 'a']++;
        
        int min = freq['a' - 'a'];

        min = Math.min(min , freq['b'-'a']);
        min = Math.min(min , freq['l'-'a']/2);
        min = Math.min(min , freq['o'-'a']/2);
        min = Math.min(min , freq['n'-'a']);

        return min;
    }
}