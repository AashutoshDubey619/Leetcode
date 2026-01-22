class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {

        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();
        HashSet<Integer> s3 = new HashSet<>();

        for (int n : nums1) s1.add(n);
        for (int n : nums2) s2.add(n);
        for (int n : nums3) s3.add(n);

        HashSet<Integer> res = new HashSet<>();

        for (int n : s1) {
            if (s2.contains(n) || s3.contains(n)) {
                res.add(n);
            }
        }

        for (int n : s2) {
            if (s3.contains(n)) {
                res.add(n);
            }
        }

        return new ArrayList<>(res);
    }
}
