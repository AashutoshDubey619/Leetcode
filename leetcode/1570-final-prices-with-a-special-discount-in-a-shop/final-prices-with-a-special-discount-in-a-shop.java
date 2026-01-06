class Solution {
    public int[] finalPrices(int[] prices) {
        

        int[] ans = prices.clone();

        Deque<Integer> stk = new ArrayDeque<>();

        ans = prices;

        for(int i=0;i<prices.length;i++){
             while(!stk.isEmpty() && prices[stk.peek()] >= prices[i]){
                int disc = prices[stk.peek()] - prices[i];
                ans[stk.pop()] = disc;
             }
             stk.push(i);
        }
        
        return ans;
    }
}