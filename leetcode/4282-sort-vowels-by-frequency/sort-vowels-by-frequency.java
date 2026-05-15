class Solution {
    class Triplet{
        char ch ;
        int freq;
        int idx;

        Triplet(char ch , int freq , int idx){
            this.ch = ch;
            this.freq = freq;
            this.idx = idx;
        }
    }

    public String sortVowels(String s) {
        
        String vowels = "aeiou";
        HashMap<Character , Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder(s);
        HashSet<Character> set = new HashSet<>();

        for(char c : s.toCharArray())map.put(c , map.getOrDefault(c,0)+1);

        PriorityQueue<Triplet> pq = new PriorityQueue<>(
            (a , b) -> {
                if(b.freq == a.freq) return a.idx - b.idx;
                return b.freq - a.freq;
            }
        );

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);

            if(vowels.indexOf(c) == -1)continue;

            if(!set.contains(c))pq.add(new Triplet(c , map.get(c) , i));
            set.add(c);
        }

        for(int i=0;i<sb.length();i++){
            char c = sb.charAt(i);

            if(vowels.indexOf(c) != -1){
               if(pq.peek().freq > 1){
                sb.setCharAt(i , pq.peek().ch);
                pq.peek().freq--;
               }
               else if(pq.peek().freq == 1){
                sb.setCharAt(i , pq.poll().ch);
               }
            }
        }

        return sb.toString();
    }
}