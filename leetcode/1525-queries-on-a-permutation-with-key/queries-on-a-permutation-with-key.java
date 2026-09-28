class Solution {
    public int[] processQueries(int[] queries, int m) {
        

        ArrayList<Integer> list = new ArrayList<>();
        int ans[] = new int[queries.length];

        for(int i=0;i<m;i++)list.add(i+1);

        for(int i=0;i<queries.length;i++){
            int idx = list.indexOf(queries[i]);
            ans[i] = idx;   
            int temp = list.get(idx);
            
            list.remove(idx);
            list.add(0 ,temp);
        }

        return ans;
    }
}