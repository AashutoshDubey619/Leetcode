class Solution {
    public String reverseVowels(String s) {
        
        String vowels = "aeiouAEIOU";
        int lidx = 0;  
        int ridx = s.length()-1; 

        StringBuilder sb = new StringBuilder(s);

        while(lidx < ridx){
            if(vowels.contains(String.valueOf(s.charAt(lidx))) && vowels.contains(String.valueOf(s.charAt(ridx)))){
                char temp = sb.charAt(lidx);
                sb.setCharAt(lidx , sb.charAt(ridx));
                sb.setCharAt(ridx , temp);
                lidx++;
                ridx--;
            }
            else if(vowels.contains(String.valueOf(s.charAt(lidx))) && !vowels.contains(String.valueOf(s.charAt(ridx)))) {
                ridx--;
            }
            else lidx++;
        }

        return sb.toString();
    }
}