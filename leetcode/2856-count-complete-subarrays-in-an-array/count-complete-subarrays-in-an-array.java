class Solution {
    public int countCompleteSubarrays(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();

        int n = nums.length;

        for(int x : nums)set.add(x);

        int count = 0;

        int i = 0;
        int j = 0;

        HashMap<Integer , Integer> map = new HashMap<>();

        while(j < nums.length){
            map.put(nums[j] , map.getOrDefault(nums[j] , 0) + 1);

            while(map.size() == set.size()){

                if(map.size() == set.size())count += n - j;
                if(map.get(nums[i]) == 1)map.remove(nums[i]);
                else map.put(nums[i] , map.get(nums[i]) - 1);

                i++;
            }

            j++;
        }

        return count;
    }
}