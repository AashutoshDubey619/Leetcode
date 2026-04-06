class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        
        HashMap<String , Integer> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();

        for(String s : banned)set.add(s);

        paragraph = paragraph.toLowerCase();

        String[] words = paragraph.split("[!?',;. ]+");

        for(String word : words){
            map.put(word , map.getOrDefault(word ,0)+1);
        }

        String max_word = "";
        int max_freq = Integer.MIN_VALUE;

        for(String word : words){
            if(set.contains(word))continue;
            if(map.get(word) > max_freq){
                max_word = word;
                max_freq = map.get(word);
            }
        }

        return max_word;
    }
}