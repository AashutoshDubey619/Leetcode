class Solution {
    public int characterReplacement(String s, int k) {

        int i = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int max_freq = 0;
        int max_len = 0;

        for (int j = 0; j < s.length(); j++) {

            char c = s.charAt(j);
            map.put(c, map.getOrDefault(c, 0) + 1);

            max_freq = Math.max(max_freq, map.get(c));

            while ((j - i + 1) - max_freq > k) {
                char ch = s.charAt(i);
                map.put(ch, map.get(ch) - 1);
                i++;
            }

            max_len = Math.max(max_len, j - i + 1);
        }

        return max_len;
    }
}
