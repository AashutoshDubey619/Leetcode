class Solution {
    public String removeStars(String s) {
        
        StringBuilder sb = new StringBuilder();

        Stack<Character> stk = new Stack<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '*'){
                sb.deleteCharAt(sb.length()-1);
                stk.pop();
            }
            else{
                stk.push(s.charAt(i));
                sb.append(s.charAt(i));
            } 
        }

        return sb.toString();

    }
}