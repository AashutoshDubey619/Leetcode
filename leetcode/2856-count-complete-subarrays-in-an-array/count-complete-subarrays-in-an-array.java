class Solution {
    public int countCompleteSubarrays(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int x : nums) {
            set.add(x);
        }

        int required = set.size();

        HashMap<Integer, Integer> map = new HashMap<>();

        int i = 0;
        int count = 0;

        for(int j = 0; j < nums.length; j++) {

            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);

            while(map.size() == required) {

                count += nums.length - j;

                map.put(nums[i], map.get(nums[i]) - 1);

                if(map.get(nums[i]) == 0) {
                    map.remove(nums[i]);
                }

                i++;
            }
        }

        return count;
    }
}