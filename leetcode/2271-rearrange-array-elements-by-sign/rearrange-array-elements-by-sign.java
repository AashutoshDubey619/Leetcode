class Solution {
    public int[] rearrangeArray(int[] nums) {
        
         List<Integer> pos = new ArrayList<>();
         List<Integer> neg = new ArrayList<>();
        
        for(int num : nums){
            if(num > 0){
                pos.add(num);
            }
            else{
                neg.add(num);
            }
        }

        for(int i=0;i<nums.length;i++){
            if(i % 2 == 0){
                nums[i] = pos.get(0);
                pos.remove(0);
            }
            else{
                nums[i] = neg.get(0);
                neg.remove(0);
            }
        }
    
        return nums;
    }
}