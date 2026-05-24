class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        
        // HashMap<Integer , ArrayList<Integer>> map = new HashMap<>();

        // for(int i=0;i<nums.length;i++){
        //     if(nums[i] == x){
        //         map.putIfAbsent(nums[i] , new ArrayList<>());
        //         map.get(nums[i]).add(i);
        //     }
        // }

       ArrayList<Integer> idxs = new ArrayList<>();    

        for(int i=0;i<nums.length;i++){
            if(nums[i] == x)idxs.add(i);
        }

        int res[] = new int[queries.length];

        for(int i=0;i<queries.length;i++){
            if(queries[i] > idxs.size())res[i] = -1;
            else{
                res[i] = idxs.get(queries[i]-1);
            }
        }

        return res;
    }
}