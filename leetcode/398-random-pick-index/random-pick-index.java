class Solution {
    HashMap<Integer , ArrayList<Integer>> map = new HashMap<>();

    public Solution(int[] nums) {
        for(int i=0;i<nums.length;i++){
            map.putIfAbsent(nums[i] , new ArrayList<>());
            map.get(nums[i]).add(i);
        }
    }
    
    public int pick(int target) {
        int len = map.get(target).size();

        int idx = (int)(Math.random() * len);

        return map.get(target).get(idx);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */