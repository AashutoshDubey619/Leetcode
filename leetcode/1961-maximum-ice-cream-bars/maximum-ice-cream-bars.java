class Solution {
    public int maxIceCream(int[] costs, int coins) {
        
        int ice = 0 ;

        Arrays.sort(costs);

        for(int c : costs){
            if(c > coins)return ice;
            else{
                coins -= c;
                ice++;
            }
        }

        return ice;
    }
}