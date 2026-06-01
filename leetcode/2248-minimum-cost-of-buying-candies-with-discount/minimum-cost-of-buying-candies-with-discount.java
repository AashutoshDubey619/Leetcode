class Solution {
    public int minimumCost(int[] cost) {

        Arrays.sort(cost);

        int ans = 0;
        int cnt = 0;

        for(int i = cost.length - 1; i >= 0; i--) {
            if(cnt != 2) {
                ans += cost[i];
            }

            cnt = (cnt + 1) % 3;
        }

        return ans;
    }
}