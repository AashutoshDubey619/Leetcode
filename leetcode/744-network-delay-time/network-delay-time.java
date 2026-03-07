// class Solution {
//     class Pair{
//         int node;
//         int time;

//         Pair(int node , int time){
//             this.node = node;
//             this.time = time;
//         }
//     }

//     public int networkDelayTime(int[][] times, int n, int k) {
        
//         List<List<Pair>> adj = new ArrayList<>();
//         int timings[] = new int[n+1];

//         Arrays.fill(timings , Integer.MAX_VALUE);

//         for(int i = 0; i <= n; i++){
//                 adj.add(new ArrayList<>());
//             }

//          for(int i=0;i<times.length;i++){
//             adj.get(times[i][0]).add(new Pair(times[i][1] , times[i][2]));
//          }

//          PriorityQueue<Pair> pq = new PriorityQueue<>(
//             (a,b) -> a.time - b.time
//          );

//          pq.offer(new Pair(k , 0));
//          timings[k] = 0;

//          while(pq.size() > 0){
//             Pair top = pq.poll();

//             for(Pair p : adj.get(top.node)){
//                int total_time = top.time + p.time;

//                 if(timings[p.node] > total_time){
//                     timings[p.node] = total_time;
//                     pq.offer(new Pair(p.node , total_time));
//                 }
//             }
//          }

//         int min_time = -1;

//         for(int i=1;i<=timings.length;i++){
//             if(timings[i] == Integer.MAX_VALUE) return -1;

//             min_time = Math.max(min_time , timings[i]);
//         }

//         return min_time;
//     }
// }
class Solution {

    class Pair{
        int node;
        int time;

        Pair(int node , int time){
            this.node = node;
            this.time = time;
        }
    }

    public int networkDelayTime(int[][] times, int n, int k) {

        List<List<Pair>> adj = new ArrayList<>();

        for(int i = 0; i <= n; i++){
            adj.add(new ArrayList<>());
        }

        for(int i = 0; i < times.length; i++){
            adj.get(times[i][0]).add(new Pair(times[i][1], times[i][2]));
        }

        int timings[] = new int[n+1];
        Arrays.fill(timings, Integer.MAX_VALUE);

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.time - b.time);

        pq.offer(new Pair(k,0));
        timings[k] = 0;

        while(!pq.isEmpty()){

            Pair top = pq.poll();

            for(Pair p : adj.get(top.node)){

                int total_time = top.time + p.time;

                if(timings[p.node] > total_time){

                    timings[p.node] = total_time;
                    pq.offer(new Pair(p.node, total_time));
                }
            }
        }

        int min_time = 0;

        for(int i = 1; i <= n; i++){
            if(timings[i] == Integer.MAX_VALUE)
                return -1;

            min_time = Math.max(min_time, timings[i]);
        }

        return min_time;
    }
}