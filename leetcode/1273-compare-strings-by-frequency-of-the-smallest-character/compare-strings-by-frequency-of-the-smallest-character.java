class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        
        int[] res = new int[queries.length];

        int[] freq = new int[words.length];

        for(int i=0;i<words.length;i++){

           char min_char = words[i].charAt(0);

           for(int j=1;j<words[i].length();j++){
               if(words[i].charAt(j) < min_char)min_char = words[i].charAt(j);
           }


            int freq_w = 0;

            for(int k=0;k<words[i].length();k++){
                if(words[i].charAt(k) == min_char)freq_w++;
            }

            freq[i] = freq_w;
        }

        for(int i=0;i<queries.length;i++){
            
            char min_char = queries[i].charAt(0);
            
            for(int j=1;j < queries[i].length();j++){
               if(queries[i].charAt(j) < min_char)min_char = queries[i].charAt(j);
           }

            int freq_q = 0;

            for(int k=0;k<queries[i].length();k++){
                if(queries[i].charAt(k) == min_char)freq_q++;
            }

            int count = 0;

            for(int a=0;a<freq.length;a++){
                if(freq_q < freq[a])count++;
            }

            res[i] = count;
        }

        return res;
    }
}