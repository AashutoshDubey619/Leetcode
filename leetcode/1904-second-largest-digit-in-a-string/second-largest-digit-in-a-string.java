class Solution {
    public int secondHighest(String s) {
        int first = -1, second = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                int d = c - '0';
                if (d > first) {
                    second = first;
                    first = d;
                } else if (d < first && d > second) {
                    second = d;
                }
            }
        }
        return second;
    }
}
