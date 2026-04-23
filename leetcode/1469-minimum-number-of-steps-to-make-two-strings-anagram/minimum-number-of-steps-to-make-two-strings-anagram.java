class Solution {
    public int minSteps(String s, String t) {
        
        int freqs[] = new int[26];
        int freqt[] = new int[26];

        int min_steps = 0;

        for(int i=0;i<s.length();i++){
            freqs[s.charAt(i) - 'a']++;
        }

        for(int i=0;i<t.length();i++){
            freqt[t.charAt(i) - 'a']++;
        }

        for(int i=0;i<freqt.length;i++){
            if(freqs[i] > freqt[i])min_steps += Math.abs(freqt[i] - freqs[i]);
        }

        return min_steps;
    }
}