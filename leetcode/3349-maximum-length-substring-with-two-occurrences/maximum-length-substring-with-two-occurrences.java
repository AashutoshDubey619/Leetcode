class Solution {
    public int maximumLengthSubstring(String s) {
        
        HashSet<Character> set = new HashSet<>();
        HashMap<Character , Integer> map = new HashMap<>();

        for(char c : s.toCharArray())set.add(c);

        int size = set.size();
        int longest = 0;

        int i = 0, j = 0;

        while(j < s.length()){

            map.put(s.charAt(j) , map.getOrDefault(s.charAt(j) , 0 )+1);

            for(char key : map.keySet()){
                while(map.get(key) > 2){
                    map.put(s.charAt(i) , map.get(s.charAt(i))-1);
                    i++;
                }
            }

            longest = Math.max(longest , j-i+1);

            j++;
        }   

        return longest;

    }
}