class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        
        int i = 0;
        int j = 0;
        int shortest = Integer.MAX_VALUE;
        int ones = 0;
        String res = "";

        while(j < s.length()){
            if(s.charAt(j) == '1')ones++;

            while(ones == k){
                if((j-i+1) < shortest){
                    shortest = (j-i+1);
                    res = s.substring(i , j + 1);
                }
                else if((j-i+1) == shortest){
                    if(res == "")res = s.substring(i , j+1);
                    else{
                        String temp = s.substring(i , j + 1);
                        if(res.compareTo(temp) > 0)res = temp;
                    }
                }
                if(s.charAt(i) == '1')ones--;
                i++;
            }

            j++;
        }

        return res;
        
    }
}