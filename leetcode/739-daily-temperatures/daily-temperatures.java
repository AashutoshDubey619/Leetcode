class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int[] ans = new int[temperatures.length];

        Stack<Integer> stk = new Stack<>();


        for(int i=0;i<temperatures.length;i++){
            while(!stk.isEmpty() && temperatures[stk.peek()] < temperatures[i]){
                int x = stk.peek();
                ans[stk.pop()] = i - x;
            }

            stk.push(i);
        }

        return ans;

    }
}