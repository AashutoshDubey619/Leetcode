class Solution {
    public int sumCounts(List<Integer> nums) {
        
        HashSet<HashSet<Integer>> set = new HashSet<>();
        int sum = 0;

        for(int i=0;i<nums.size();i++){
            HashSet<Integer> set2 = new HashSet<>();

            for(int j=i;j<nums.size();j++){
                set2.add(nums.get(j));

                if(!set.contains(set2))sum += (set2.size() * set2.size());
            }
        }

        return sum;
    }
}