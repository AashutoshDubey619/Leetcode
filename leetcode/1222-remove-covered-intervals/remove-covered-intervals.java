class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        
        int count = 0;

        for(int i=0;i<intervals.length;i++){
            boolean isCovered = false;

            for(int j=0;j<intervals.length;j++){
                if(j == i) continue;

                int[] prev = intervals[i];
                int[] curr = intervals[j];

                if(curr[0] <= prev[0] && curr[1] >= prev[1]){
                    isCovered = true;
                }
            }

            if(!isCovered){
                count++;
            }
        }

        return count;

    }
}