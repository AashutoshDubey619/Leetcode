class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int n : nums) set.add(n);

        Integer[] res = set.toArray(new Integer[0]);

        Arrays.sort(res, Collections.reverseOrder());

        if(res.length >= 3) return res[2];
        
        return res[0];
    }
}