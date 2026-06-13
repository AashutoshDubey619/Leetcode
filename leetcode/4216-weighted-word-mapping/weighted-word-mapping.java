class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        
        StringBuilder sb = new StringBuilder();

        for(String word : words){
            int weight = 0;

            for(int i=0;i<word.length();i++){
                weight += weights[word.charAt(i) - 'a'];
            }

            weight = weight % 26;

            sb.append((char)('z' - weight));
        }

        return sb.toString();
    }
}