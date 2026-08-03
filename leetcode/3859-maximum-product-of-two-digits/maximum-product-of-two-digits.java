class Solution {
    public int maxProduct(int n) {

        ArrayList<Integer> list = new ArrayList<>();

        int mx1 = -1;
        int mx2 = -1;

        while(n > 0){
            int d = (n % 10);

            if(d >= mx1){
                mx2 = mx1;
                mx1 = d;
            }

            if(d >= mx2 && d < mx1)mx2 = d;

            n /= 10;
        }

        return mx1 * mx2;
    }
}