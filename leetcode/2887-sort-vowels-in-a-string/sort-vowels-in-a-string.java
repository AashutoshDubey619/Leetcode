class Solution {
    public String sortVowels(String s) {
        
        String vowels = "AEIOUaeiou";

        ArrayList<Character> vows = new ArrayList<>();

        for(int i=0;i<s.length();i++){
            if(vowels.indexOf(s.charAt(i)) != -1){
                vows.add(s.charAt(i));
            }
        }

        Collections.sort(vows);

        String res = "";

        for(int i=0;i<s.length();i++){
            if(vowels.indexOf(s.charAt(i)) != -1){
                res += vows.get(0);
                vows.remove(0);
            }
            else res += s.charAt(i);
        }
        
        return res;
    }
}