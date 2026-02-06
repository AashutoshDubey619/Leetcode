class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        boolean[] freq = new boolean[128];

        for(char c : jewels.toCharArray()) {
            freq[c] = true;
        }

        int count = 0;
        for(char c : stones.toCharArray()) {
            if(freq[c]) count++;
        }
        return count;
    }
}
