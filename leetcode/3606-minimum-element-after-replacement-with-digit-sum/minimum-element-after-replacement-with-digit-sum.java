class Solution {
    public int minElement(int[] nums) {
        
        int min = Integer.MAX_VALUE;

        for(int num : nums){
            int x = num;
            int sum = 0;

            while(x > 0){
                sum += x % 10;
                x /= 10;
            }

            min = Math.min(min , sum);
        }

        return min;
    }
}