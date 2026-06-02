class Solution {
    public String reversePrefix(String s, int k) {
    
    StringBuilder sb = new StringBuilder(s);

     int l = 0;
     int r = k-1;

     while(l < r){
        char temp = sb.charAt(l);
        sb.setCharAt(l , sb.charAt(r));
        sb.setCharAt(r , temp);
        l++;
        r--;
     }


        return sb.toString();
    }
}