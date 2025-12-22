class Solution {
    public int myAtoi(String s) {

        int i = 0;
        boolean neg = false;    
        long num = 0;

        s = s.trim();
        if(s.length() == 0) return 0;

      
        if(s.charAt(i) == '-' || s.charAt(i) == '+'){
            neg = (s.charAt(i) == '-');
            i++;
        }

       
        while(i < s.length() && s.charAt(i) == '0'){
            i++;
        }

        while(i < s.length() && Character.isDigit(s.charAt(i))){
            num = num * 10 + (s.charAt(i) - '0');

            if(neg && -num < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            if(!neg && num > Integer.MAX_VALUE) return Integer.MAX_VALUE;

            i++;
        }

        return neg ? (int)-num : (int)num;
    }
}
