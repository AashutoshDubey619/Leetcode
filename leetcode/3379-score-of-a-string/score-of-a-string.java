class Solution {
    public int scoreOfString(String s) {
        int sum = 0;

        int i = 0;
        int j = 1;

        while(j < s.length()){
            sum += Math.abs(s.charAt(i) - s.charAt(j));
            i++;
            j++;
        }

        return sum;
    }
}