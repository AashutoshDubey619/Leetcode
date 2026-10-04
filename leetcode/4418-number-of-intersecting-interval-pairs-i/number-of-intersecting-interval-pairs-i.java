class Solution {
    public int countIntersectingIntervals(int[][] intervals) {
        
        int n = intervals.length;

        Arrays.sort(intervals , (a,b) -> {
            return a[0] - b[0];
        });

        int count = 0;

        for(int i=0;i<n;i++){
            int prevstart = intervals[i][0];
            int prevend = intervals[i][1];

            for(int j=i+1;j<n;j++){
                int currstart = intervals[j][0];
                int currend = intervals[j][1];

                if(prevend >= currstart)count++;
            }
        }

        return count;
    }
}