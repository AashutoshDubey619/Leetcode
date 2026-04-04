class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        int[] freq = new int[1001];
        ArrayList<Integer> list = new ArrayList<>();

        for(int n : nums1)freq[n]++;

        for(int i=0;i<nums2.length;i++){
            if(freq[nums2[i]] > 0){
                freq[nums2[i]]--;
                list.add(nums2[i]);
            }
        }

        int res[] = new int[list.size()];

        for(int i=0;i<list.size();i++){
            res[i] = list.get(i);
        }

        return res;
    }
}