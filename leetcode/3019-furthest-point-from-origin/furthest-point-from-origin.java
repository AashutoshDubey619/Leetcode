class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        
        int x = 0;
        int y = 0;

        int i = 0;
        int count = 0;


        while(i < moves.length()){
            if(moves.charAt(i) == 'L')x++;
            else if(moves.charAt(i) == '_')count++;
            else y++;
            i++;
        }


        return Math.abs(x - y) + count;  
    }
}