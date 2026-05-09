class Solution {
    class Pair{
        String word;
        int freq;

        Pair(String word , int freq){
            this.word = word;
            this.freq = freq;
        }
    }

    public List<String> topKFrequent(String[] words, int k) {
        List<String> res = new ArrayList<>();

        HashMap<String , Integer> map = new HashMap<>();

        for(int i=0;i<words.length;i++){
            map.put(words[i] , map.getOrDefault(words[i] , 0)+1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->{
            if(a.freq == b.freq)return b.word.compareTo(a.word);
            return a.freq - b.freq;
        });

        for(String key : map.keySet()){
            pq.offer(new Pair(key , map.get(key)));

            if(pq.size() > k){
                pq.poll();
            }
        }

        while(!pq.isEmpty()){
            Pair p = pq.poll();
            res.add(p.word);
        }

        Collections.reverse(res);
        
        return res;
    }
}