class Solution {
    public int minimumCost(int[] cost) {
        
        int c = 0;

        Arrays.sort(cost);

        int i = cost.length - 1;
        int x = 0;

        while(i >= 0){
            if(x < 2){
                c += cost[i];
                x++;
            }
            else if(x >= 2){
                x = 0;
            }
            i--;
        }
        
        return c;
    }
}