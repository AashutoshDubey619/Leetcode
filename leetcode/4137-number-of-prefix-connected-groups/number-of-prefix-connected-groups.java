class Solution {
    public int prefixConnected(String[] words, int k) {
        
        HashMap<String , Integer> map = new HashMap<>();
        int groups = 0;

        for(String word : words){
            if(word.length() < k)continue;
            String pre = word.substring(0 , k);

            map.put(pre , map.getOrDefault(pre , 0)+1);
        }

        for(int val : map.values()){
            if(val >= 2)groups++;
        }

        return groups;
    }
}