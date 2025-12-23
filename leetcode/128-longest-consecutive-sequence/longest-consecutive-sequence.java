class Solution {
    public int longestConsecutive(int[] nums) {
          
          HashSet<Integer> set = new HashSet<>();
          int count = 0;
          int longest = 1;

            if(nums.length == 0) return 0;

          for(int num : nums){
            set.add(num);
          }

         for(int it : set){
            if(!set.contains(it-1)){
                count = 1;
                int x = it;

                while(set.contains(x+1)){
                    x++;
                    count++;
                }
                longest = Math.max(longest , count);
            }
         }

         return longest;

    }
}