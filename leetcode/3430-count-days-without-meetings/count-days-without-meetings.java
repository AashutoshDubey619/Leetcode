class Solution {
    public int countDays(int days, int[][] meetings) {

        if (meetings.length == 0) return days;

        int count = 0;

        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> res = new ArrayList<>();
        res.add(meetings[0]);

        for (int i = 1; i < meetings.length; i++) {
            int[] curr = meetings[i];
            int[] prev = res.get(res.size() - 1);

           
            if (curr[0] <= prev[1]) {
                prev[1] = Math.max(prev[1], curr[1]);
            } 
          
            else {
                res.add(curr);
            }
        }

        
        for (int i = 1; i < res.size(); i++) {
            int[] prev = res.get(i - 1);
            int[] curr = res.get(i);
            count += curr[0] - prev[1] - 1;
        }

      
        count += res.get(0)[0] - 1;

        
        count += days - res.get(res.size() - 1)[1];

        return count;
    }
}
