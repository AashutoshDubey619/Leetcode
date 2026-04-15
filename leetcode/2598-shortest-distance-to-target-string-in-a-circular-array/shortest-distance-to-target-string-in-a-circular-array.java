class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        
        int n = words.length;

        for (int k = 0; k < n; k++) {
            
            int right = (startIndex + k) % n;
            int left = (startIndex - k + n) % n;

            if (words[right].equals(target) || words[left].equals(target)) {
                return k; 
            }
        }

        return -1; 
    }
}