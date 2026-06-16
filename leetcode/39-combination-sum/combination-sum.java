class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();

        combs(0 , candidates , target , res , new ArrayList<>());

        return res;
    }
    
    public void combs(int i , int[] candidates , int target , List<List<Integer>> res , ArrayList<Integer> temp){
        if(target == 0){
            res.add(new ArrayList<>(temp));
            return;
        }

        if(target < 0 || i == candidates.length){
            return;
        }

        temp.add(candidates[i]);
        
        combs(i , candidates , target - candidates[i] , res , temp);
        temp.remove(temp.size()-1);
        combs(i + 1 , candidates , target , res , temp);
    }

}