class Solution {
    public int minPartitions(String n) {
        
        int max_dig = -1;

        for(int i=0;i<n.length();i++){
            max_dig = Math.max(max_dig , n.charAt(i)-'0');
        }

        return max_dig;
    }
}