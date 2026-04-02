class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int n : nums) {
            map.put(n , map.getOrDefault(n,0)+1);
        }

        while(!map.isEmpty()){
            List<Integer> row = new ArrayList<>();

            
            List<Integer> keys = new ArrayList<>(map.keySet());

            for(int key : keys){
                row.add(key);

                if(map.get(key) == 1){
                    map.remove(key);  
                } else {
                    map.put(key , map.get(key)-1); 
                }
            }

            ans.add(row);
        }

        return ans;
    }
}