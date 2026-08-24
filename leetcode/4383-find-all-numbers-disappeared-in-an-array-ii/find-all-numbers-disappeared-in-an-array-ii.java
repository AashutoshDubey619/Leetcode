class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        List<List<Integer>> res = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int x : nums) {
            set.add(x);
        }

        int i = lower;

        while (i <= upper) {
            if (set.contains(i)) {
                i++;
                continue;
            }

            int start = i;

            while (i <= upper && !set.contains(i)) {
                i++;
            }

            res.add(Arrays.asList(start, i - 1));
        }

        return res;
    }
}