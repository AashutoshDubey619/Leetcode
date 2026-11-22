class Solution {
    public boolean checkString(String s) {
        
        int first_idx = -1;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'b'){
                first_idx = i;
                break;
            }
        }

        if(first_idx == -1)return true;

      
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'a' && i > first_idx){
            return false;
            }
        }

        return true;
    }
}