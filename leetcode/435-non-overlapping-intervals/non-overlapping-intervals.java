class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) return 0;

      
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int count = 0;
        int[] prev = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            int[] curr = intervals[i];

          
            if (curr[0] < prev[1]) {
                count++; 

                
                if (curr[1] < prev[1]) {
                    prev = curr;
                }
            }
           
            else {
                prev = curr;
            }
        }

        return count;
    }
}
