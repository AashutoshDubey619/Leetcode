class Solution {
    public int numberOfSpecialChars(String word) {
        
        int special = 0;

        HashSet<Character> set = new HashSet<>();
        HashMap<Character , Integer> map = new HashMap<>();

        for(int i=word.length()-1;i>=0;i--){
            if(Character.isUpperCase(word.charAt(i))){
                map.put(word.charAt(i) , i);
                set.add(word.charAt(i));
            }
        }

        for(int i=0;i<word.length();i++){
            if(Character.isLowerCase(word.charAt(i))){
                map.put(word.charAt(i) , i);
            }
        }

        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(set.add(ch) && set.contains(Character.toUpperCase(ch)) && map.get(ch) < map.get(Character.toUpperCase(ch)))special++;
        }

        return special;
    }
}