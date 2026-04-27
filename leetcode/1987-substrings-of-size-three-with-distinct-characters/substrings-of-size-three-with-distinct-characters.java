class Solution {
    public int countGoodSubstrings(String s) {
        
        int count = 0;
        if(s.length() < 3)return 0;

        HashMap<Character , Integer> map = new HashMap<>();

        for(int i=0;i<3;i++)map.put(s.charAt(i) , map.getOrDefault(s.charAt(i) , 0) + 1);

        if(map.size() == 3)count++;

        int i = 0;
        int j = 3;

        while(j < s.length()){
            char cj = s.charAt(j);
            char ci = s.charAt(i);
            
            map.put(cj , map.getOrDefault(cj,0)+1);


            if(map.get(ci) == 1)map.remove(ci);
            else map.put(ci , map.get(ci)-1);


            if(map.size() == 3)count++;

            j++;
            i++;
        }

        return count;
    }
}