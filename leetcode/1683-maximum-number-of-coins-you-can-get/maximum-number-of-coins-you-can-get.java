class Solution {
    public int maxCoins(int[] piles) {
        
        Arrays.sort(piles);

        int alice = piles.length - 1;
        int me = piles.length - 2;
        int bob = 0;

        int max_coins = 0;

        while(bob < me){
            max_coins += piles[me];
            me -= 2;
            alice -= 2;
            bob++;
        }

        return max_coins;
    }
}