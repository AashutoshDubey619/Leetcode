class Solution {
    public int[] shortestToChar(String s, char c) {
        
     List<Integer> idxs = new ArrayList<>();

     for(int i=0;i<s.length();i++){
        if(s.charAt(i) == c)idxs.add(i);
     }

     int[] ans = new int[s.length()];

     for(int i=0;i<ans.length;i++){
        int dist = Integer.MAX_VALUE;

        for(int j=0;j<idxs.size();j++){
            dist = Math.min(dist , Math.abs(idxs.get(j) - i));
        }

        ans[i] = dist;
     }

     return ans;
    }
}