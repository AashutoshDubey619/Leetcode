class Solution {
    public String sortVowels(String s) {
        
        String vowels = "AEIOUaeiou";

        ArrayList<Character> vows = new ArrayList<>();

        for(char c : s.toCharArray()){
            if(vowels.indexOf(c) != -1){
                vows.add(c);
            }
        }

        Collections.sort(vows);

        StringBuilder res = new StringBuilder();
        int j = 0;

        for(char c : s.toCharArray()){
            if(vowels.indexOf(c) != -1){
                res.append(vows.get(j++));
            } else {
                res.append(c);
            }
        }

        return res.toString();
    }
}