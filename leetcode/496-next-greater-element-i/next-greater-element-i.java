class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        HashMap<Integer , Integer> map = new HashMap<>();

        Stack<Integer> stk = new Stack<>();

        for(int i=0;i<nums2.length;i++){
            while(!stk.isEmpty() && stk.peek() < nums2[i]){
                map.put(stk.pop() , nums2[i]);
            }

                stk.push(nums2[i]);
        }

        for(int i=0;i<nums1.length;i++){
            if(!map.containsKey(nums1[i])){
                nums1[i] = -1;
            }
            else{
                nums1[i] = map.get(nums1[i]);
            }
        }
        
        return nums1;

    }
}