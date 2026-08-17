class Solution {
    public int elevatorRequests(int n, int[] requests) {
        
        int time = 0;
        int curr = 0;

        for(int i=0;i<requests.length;i++){
            int dist = Math.abs(requests[i] - curr);
            time += dist;
            curr = requests[i];
        }

        return time;
    }
}