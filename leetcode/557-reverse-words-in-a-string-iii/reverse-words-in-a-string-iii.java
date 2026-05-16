class Solution {
    public String reverseWords(String s) {
        
        String parts[] = s.split(" ");
        StringBuilder res = new StringBuilder();

        for(String part : parts){
            StringBuilder sb = new StringBuilder(part);

            sb.reverse();

            if(res.isEmpty())res.append(sb);
            else res.append(" " + sb);
        }

        return res.toString();
    }
}