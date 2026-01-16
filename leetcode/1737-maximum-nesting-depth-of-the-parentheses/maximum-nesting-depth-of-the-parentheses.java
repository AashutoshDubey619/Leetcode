class Solution {
    public int maxDepth(String s) {
        
        int max_count = 0;
        Stack<Character> stk = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch == '('){
                stk.push(ch);
                max_count = Math.max(max_count , stk.size());
            }
            else if(ch == ')'){
                stk.pop();
            }

        }

        return max_count;

    }
}