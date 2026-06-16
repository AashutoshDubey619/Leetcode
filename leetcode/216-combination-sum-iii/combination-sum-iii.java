class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {   
        List<List<Integer>> res = new ArrayList<>();

        combs(new ArrayList<>(), 1 , k , n , res);

        return res;
    }

    public void combs(ArrayList<Integer> temp , int i, int k , int n, List<List<Integer>> res ){
        if(temp.size() == k){
            if(n == 0)res.add(new ArrayList<>(temp));
            return;
        }  

        if(i > 9)return;

        combs(temp , i+1 , k , n , res);
        temp.add(i);
        combs(temp , i+1 , k , n-i , res);
        temp.remove(temp.size()-1);
    }
        
}
