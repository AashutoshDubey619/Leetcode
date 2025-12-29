class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {

        if (firstList.length == 0 || secondList.length == 0) {
            return new int[0][0];
        }

        List<int[]> res = new ArrayList<>();

        for (int i = 0; i < firstList.length; i++) {
            int[] prev = firstList[i];

            for (int j = 0; j < secondList.length; j++) {
                int[] curr = secondList[j];

                if (curr[0] <= prev[1] && curr[1] >= prev[0]) {

                    int start = Math.max(prev[0], curr[0]);
                    int end   = Math.min(prev[1], curr[1]);

                    res.add(new int[]{start, end});
                }
            }
        }

        return res.toArray(new int[res.size()][2]);
    }
}
