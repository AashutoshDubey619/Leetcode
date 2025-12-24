class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        
        int count = 0;
        Arrays.sort(capacity);

        int asum = 0;

        for(int i=0;i<apple.length;i++){
            asum += apple[i];
        }

        for(int i=capacity.length-1;i>=0;i--){
            asum -= capacity[i];
            count++;
            if(asum <= 0){
                return count;
            }
        }
        return count;
    }
}