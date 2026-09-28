class Solution {
    public int[] processQueries(int[] queries, int m) {
        

        ArrayList<Integer> list = new ArrayList<>();
        int ans[] = new int[queries.length];

        for(int i=0;i<m;i++)list.add(i+1);

        for(int i=0;i<queries.length;i++){
            int idx = list.indexOf(queries[i]);
            ans[i] = idx;   
            int temp = list.get(idx);

            for(int j=idx;j>0;j--){
                list.set(j , list.get(j-1));
            }

            list.set(0 ,temp);
        }

        return ans;
    }
}