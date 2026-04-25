class Solution {
    public String reverseOnlyLetters(String s) {
        
        ArrayList<Character> list = new ArrayList<>();

        for(char c : s.toCharArray()){
            if((c >= 'a' && c <= 'z')  || (c>='A' && c<= 'Z'))list.add(c);
        }

        Collections.reverse(list);

        StringBuilder sb = new StringBuilder();

        int k = 0;

        for(char c : s.toCharArray()){
            if(!((c >= 'a' && c <= 'z')  || (c>='A' && c<= 'Z'))){
                sb.append(c);
            }
            else sb.append(list.get(k++));
        }

        return sb.toString();
    }
}