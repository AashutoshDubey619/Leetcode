class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> list = new ArrayList<>(); 
       

        findsets(new ArrayList<>(), nums , 0 , list);

        return list;
    }

    public void findsets(List<Integer> ans , int[] nums , int idx ,List<List<Integer>> list ){
        if(idx == nums.length){
            list.add(new ArrayList<>(ans));
            return;
        }

        ans.add(nums[idx]);
        findsets(ans , nums , idx + 1 , list);
        
        ans.remove(ans.size()-1);
        findsets(ans , nums , idx + 1 , list);
    }
}