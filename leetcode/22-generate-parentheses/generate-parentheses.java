class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> res = new ArrayList<>();

        solve(0 , 0  , "" , n , res);
        return res;
    }

    public void solve(int open , int close , String s , int n , List<String> res){
         if(s.length() == 2*n){
            res.add(s);
            return;
         }

         if(open < n){
           solve(open + 1 , close , s + "(" , n , res );
         }

         if(close < open){
           solve(open , close + 1 , s + ")" , n , res);
         }
    }
}