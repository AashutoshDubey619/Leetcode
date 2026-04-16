class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        
        int n = nums.length;
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        
        for(int i = 0; i < n; i++){
            map.putIfAbsent(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }

        
        for(int i = 0; i < queries.length; i++){
            int idx = queries[i];
            int val = nums[idx];
            ArrayList<Integer> positions = map.get(val);

           
            if(positions.size() == 1){
                res.add(-1);
                continue;
            }

            int pos = Collections.binarySearch(positions, idx);

            int left = positions.get((pos - 1 + positions.size()) % positions.size());
            int right = positions.get((pos + 1) % positions.size());

            int d1 = Math.min(Math.abs(idx - left), n - Math.abs(idx - left));
            int d2 = Math.min(Math.abs(idx - right), n - Math.abs(idx - right));

            res.add(Math.min(d1, d2));
        }

        return res;
    }
}