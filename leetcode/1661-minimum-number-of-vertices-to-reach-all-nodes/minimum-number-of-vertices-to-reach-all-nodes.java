class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<edges.size();i++){
            set.add(edges.get(i).get(1));
        }

        ArrayList<Integer> res = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(!set.contains(i))res.add(i);
        }

        return res;
    }
}