class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        HashMap<Integer , Integer> map = new HashMap<>();
        int ans[] = new int[nums1.length];

        for(int i=0;i<nums2.length;i++){
            map.put(nums2[i] , i);
        }

        for(int i=0;i<nums1.length;i++){
            int x = nums1[i];
            for(int j=map.get(x);j<nums2.length;j++){
                if(x < nums2[j]){
                    ans[i] = nums2[j];
                    break;
                }
                else{
                    ans[i] = -1;
                }
            }
        }
            return ans;
    }
}