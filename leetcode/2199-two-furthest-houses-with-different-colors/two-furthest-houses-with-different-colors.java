class Solution {
    public int maxDistance(int[] colors) {
        
        int max_len = 0;

       for(int i=0;i<colors.length;i++){
        for(int j=colors.length-1;j>i;j--){
            if(colors[i] != colors[j]){
                max_len = Math.max(max_len , j - i);
            }
        }
       }

        return max_len;
    }
}