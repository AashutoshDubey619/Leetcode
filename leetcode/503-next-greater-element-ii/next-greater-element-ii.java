class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        int n = nums.length;

        int[] ans = new int[n];

        Arrays.fill(ans , -1);

        Stack<Integer> stk = new Stack<>();

        for(int i=0;i<2*n;i++){
            
            int idx = i % n;

            while(!stk.isEmpty() && nums[stk.peek()] <  nums[idx]){
                ans[stk.pop()] = nums[idx];
            }

            if(i < n){
                stk.push(idx);
            }
        }
        
        return ans;

    }
}