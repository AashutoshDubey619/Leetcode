class Solution {
    public int[] shortestToChar(String s, char c) {
        
        int n = s.length();
        int[] res = new int[n];

        for(int i=0;i<n;i++){
            int l = i , r = i;

            while(l >=0 || r <= n){
                if(l >= 0 && s.charAt(l) == c){
                    res[i] = Math.abs(l - i);
                    break;
                }
                else if(r < n && s.charAt(r) == c){
                    res[i] = Math.abs(r - i);
                    break;
                }
                l--;
                r++;
            }
        }
        
        return res;
    }
}