class Solution {
    public int mostWordsFound(String[] sentences) {
        int max_words = 0;

        for(int i=0;i<sentences.length;i++){
            sentences[i].trim();

            String[] parts = sentences[i].split(" ");

            max_words = Math.max(max_words , parts.length);
        }

        return max_words;
    }
}