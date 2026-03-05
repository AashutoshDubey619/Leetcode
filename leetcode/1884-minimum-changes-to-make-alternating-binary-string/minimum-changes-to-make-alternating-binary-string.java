class Solution {
    public int minOperations(String s) {
        
        int zerocount = 0;
        int onecount = 0;

        
            for(int i=0;i<s.length();i++){
                if(i % 2 == 0){
                    if(s.charAt(i) != '0')zerocount++;
                }
                else if(i % 2 != 0){
                    if(s.charAt(i) != '1')zerocount++;
                }
            }
        
        
        
            for(int i=0;i<s.length();i++){
                if(i % 2 == 0){
                    if(s.charAt(i) != '1')onecount++;
                }
                else if(i % 2 != 0){
                    if(s.charAt(i) != '0')onecount++;
                }
            }
       

        return Math.min(onecount , zerocount);
    }
}