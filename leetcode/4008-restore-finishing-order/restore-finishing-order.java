class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        
        int[] res = new int[friends.length];

        boolean[] frnd = new boolean[101];

        for(int i=0;i<friends.length;i++){
            frnd[friends[i]] = true;
        }

        int k = 0;
        for(int i=0;i<order.length;i++){
            if(frnd[order[i]] == true)res[k++] = order[i];
        }

        return res;
    }
}