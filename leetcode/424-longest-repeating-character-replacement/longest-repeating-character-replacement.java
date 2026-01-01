class Solution {
    public int characterReplacement(String s, int k) {

        int[] freq = new int[26];
        int i = 0, max_freq = 0, max_len = 0;

        for (int j = 0; j < s.length(); j++) {

            int idx = s.charAt(j) - 'A';
            freq[idx]++;
            max_freq = Math.max(max_freq, freq[idx]);

            while ((j - i + 1) - max_freq > k) {
                freq[s.charAt(i) - 'A']--;
                i++;
            }

            max_len = Math.max(max_len, j - i + 1);
        }
        return max_len;
    }
}
