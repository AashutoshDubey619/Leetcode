class Solution {
    public String reverseVowels(String s) {

        String vowels = "aeiouAEIOU";
        int lidx = 0, ridx = s.length() - 1;
        StringBuilder sb = new StringBuilder(s);

        while (lidx < ridx) {
            if (vowels.indexOf(sb.charAt(lidx)) != -1 &&
                vowels.indexOf(sb.charAt(ridx)) != -1) {

                char temp = sb.charAt(lidx);
                sb.setCharAt(lidx, sb.charAt(ridx));
                sb.setCharAt(ridx, temp);

                lidx++;
                ridx--;
            }
            else if (vowels.indexOf(sb.charAt(lidx)) != -1) {
                ridx--;
            }
            else {
                lidx++;
            }
        }

        return sb.toString();
    }
}
