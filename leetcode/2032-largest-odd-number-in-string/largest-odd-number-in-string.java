class Solution {
    public String largestOddNumber(String num) {
        
        String res = "";
        int oddidx = -1;

        for(int i = num.length() - 1; i >= 0; i--){
            if ((num.charAt(i) - '0') % 2 != 0) { 
                oddidx = i;
                break;
            }
        }

        if (oddidx == -1) return "";

        for(int i = 0; i <= oddidx; i++){
            res += num.charAt(i);
        }

        return res;
    }
}
