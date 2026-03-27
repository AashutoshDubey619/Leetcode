class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();

        if (s.length() < p.length()) return res;

        int[] pFreq = new int[26];
        int[] wFreq = new int[26];

        for (char c : p.toCharArray()) {
            pFreq[c - 'a']++;
        }

        int k = p.length();

        int i = 0, j = 0;

        while (j < k) {
            wFreq[s.charAt(j) - 'a']++;
            j++;
        }

        if (Arrays.equals(pFreq, wFreq)) res.add(0);

        while (j < s.length()) {

            wFreq[s.charAt(j) - 'a']++;

            wFreq[s.charAt(i) - 'a']--;

            i++;
            j++;

            if (Arrays.equals(pFreq, wFreq)) {
                res.add(i);
            }
        }

        return res;
    }
}