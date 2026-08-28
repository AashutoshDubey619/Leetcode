class Solution {
    public int prefixConnected(String[] words, int k) {
        
        int groups = 0;
        boolean [] isGrouped = new boolean[words.length];

        for(int i=0;i<words.length;i++){
            if(isGrouped[i])continue;

            if(words[i].length() < k)continue;

            String s1 = words[i].substring(0 , k);
            boolean hasGrp = false;

            for(int j=i+1;j<words.length;j++){
                if(words[j].length() < k)continue;
                if(isGrouped[j])continue;

                String s2 = words[j].substring(0 , k);

                if(s1.equals(s2)){
                    hasGrp = true;
                    isGrouped[j] = true;
                }
            }
            
            if(hasGrp){
                groups++;
                isGrouped[i] = true;
            }
        }

        return groups;
    }
}