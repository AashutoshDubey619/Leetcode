class Solution {
    public int digitFrequencyScore(int n) {
        
        int[] freq = new int[10];

        int x = n;

        while(x > 0){
            freq[x % 10]++;
            x /= 10;
        }

        int score = 0;

        for(int i=0;i<10;i++){
            score = score + (i * freq[i]);
        }

        return score;
    }
}