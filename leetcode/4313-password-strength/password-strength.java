class Solution {
    public int passwordStrength(String password) {
        
        HashSet<Character> set = new HashSet<>();

        int strength = 0;

        for(char c : password.toCharArray()){
            if(set.add(c)){
                if(c >= 'a' && c <= 'z')strength += 1;
                else if(c >= 'A' && c<='Z')strength += 2;
                else if(c >= '0' && c <= '9')strength += 3;
                else strength += 5;
            }
        }

        return strength;
    }
}