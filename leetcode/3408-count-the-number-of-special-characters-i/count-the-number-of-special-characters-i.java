class Solution {
    public int numberOfSpecialChars(String word) {
        
        HashSet<Character> set = new HashSet<>();

        int count = 0;

        for(char c : word.toCharArray()){
            if(c >= 'A' && c <= 'Z')set.add(c);
        }

        for(char c : word.toCharArray()){
            if(!set.contains(c) && set.contains(Character.toUpperCase(c))){
                count++;
                set.add(c);
            }
        }

        return count;
    }
} 