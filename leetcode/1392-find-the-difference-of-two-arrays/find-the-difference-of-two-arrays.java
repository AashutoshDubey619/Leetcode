class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<List<Integer>> list = new ArrayList<>();
        HashMap<Integer , Integer> map1 = new HashMap<>();
        HashMap<Integer , Integer> map2 = new HashMap<>();

        for(int i=0;i<2;i++) list.add(new ArrayList<>());
        
        for(int n : nums1) map1.put(n , map1.getOrDefault(n , 0)+1);

        for(int n : nums2) map2.put(n , map2.getOrDefault(n , 0)+1);

        for(int i=0;i<nums1.length;i++){
            if(!map2.containsKey(nums1[i]) && !list.get(0).contains(nums1[i])) list.get(0).add(nums1[i]);
        }

        for(int i=0;i<nums2.length;i++){
            if(!map1.containsKey(nums2[i]) && !list.get(1).contains(nums2[i])) list.get(1).add(nums2[i]);
        }

        return list;
    }   
}