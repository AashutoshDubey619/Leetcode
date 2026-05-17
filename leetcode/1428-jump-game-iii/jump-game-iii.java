class Solution {
    public boolean canReach(int[] arr, int start) {
        
        int n = arr.length;
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[n];

        q.add(start);

        while(!q.isEmpty()){
            int el = q.poll();
            vis[el] = true;

            if(arr[el] == 0)return true;

            if(el + arr[el] < n && !vis[el + arr[el]]){
                q.add(el + arr[el]);
            }
            if(el - arr[el] >= 0 && !vis[el - arr[el]]){
                q.add(el - arr[el]);
            }
        }

        return false;
    }
}