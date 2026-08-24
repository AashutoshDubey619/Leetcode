class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        List<List<Integer>> res = new ArrayList<>();

        HashSet<Integer> set = new HashSet<>();

        for(int x : nums)set.add(x);

        for(int i = lower; i<=upper ;i++){
           ArrayList<Integer> list = new ArrayList<>();
           int max_end = i;
           boolean flag = false;
           for(int j=i;j<=upper;j++){
                if(!set.contains(j)){
                    max_end = j;
                    flag = true;
                }
                else break;
            }

            if(flag){
                list.add(i);
                list.add(max_end);
                res.add(list);
            }
            
            i = max_end;
        }
        
        return res;
    }
}