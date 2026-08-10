class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        
        Arrays.sort(prices);
        Arrays.sort(discounts);

        int i = prices.length - 1;
        int j = discounts.length - 1;
        double sum = 0.0;

        while(i >= 0){
            int p = prices[i];
            
            if(j < 0){
                sum += p;
            }
            else{
                int d = discounts[j];
                sum += (double)p * (100 - d) / 100;
            } 

            i--;
            j--;
        }
        
        return sum;
    }
}