class Solution {
    public int[] findRightInterval(int[][] intervals) {
        
        if(intervals.length == 1 && intervals[0][0] == intervals[0][1])return new int[]{0};
        if(intervals.length == 1)return new int[]{-1};

        HashMap<Integer , Integer> map = new HashMap<>();
        int max_end = -1;

        for(int i=0;i<intervals.length;i++){
            map.put(intervals[i][0] , i);
            max_end = Math.max(max_end , intervals[i][1]);
        }

        Arrays.sort(intervals , (a , b) -> {
            return Integer.compare(a[0] , b[0]);
        });



        int[] res = new int[intervals.length];

        for(int i=0;i<intervals.length;i++){
            if(intervals[i][1] == max_end){
                res[map.get(intervals[i][0])] = -1;
                continue;
            }

            int l = i;
            int r = intervals.length - 1;
            int idx = -1;

            while(l <= r){
                int m = l + (r-l)/2;

                if(intervals[m][0] >= intervals[i][1]){
                    idx = map.get(intervals[m][0]);
                    r = m - 1;
                }
                else if(intervals[m][0] < intervals[i][1]) l = m + 1;
            }

            res[map.get(intervals[i][0])] = idx;
        }

        return res;
    }
}