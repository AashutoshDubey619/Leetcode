class Solution {
    public int findTheWinner(int n, int k) {
        
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<n;i++)list.add(i+1);
        
        int j = 0;

        while(list.size() != 1){
            int i = 0;
            while(i < k-1){
                j = (j+1)%list.size();
                i++;
            }
            list.remove(j);
        }

        return list.get(0);
    }
}