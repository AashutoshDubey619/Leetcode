class Solution {
    public List<String> stringSequence(String target) {
        List<String> res = new ArrayList<>();

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<target.length();i++){
            sb.append("a");

            while(sb.charAt(i) != target.charAt(i)){
               res.add(sb.toString());
               sb.setCharAt(i , (char)(sb.charAt(i) + 1));
            }
            res.add(sb.toString());
        }

        return res;
    }
}