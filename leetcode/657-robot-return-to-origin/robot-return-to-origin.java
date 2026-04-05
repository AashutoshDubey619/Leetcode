class Solution {
    public boolean judgeCircle(String moves) {
        
        int R_count = 0, L_count = 0 , U_count = 0 , D_count = 0;

        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i) == 'R')R_count++;
            if(moves.charAt(i) == 'L')L_count++;
            if(moves.charAt(i) == 'U')U_count++;
            if(moves.charAt(i) == 'D')D_count++;
        }

        return (R_count == L_count) && (U_count == D_count);
    }
}