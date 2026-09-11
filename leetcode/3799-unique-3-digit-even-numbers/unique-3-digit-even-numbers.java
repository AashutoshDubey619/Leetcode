class Solution {
    public int totalNumbers(int[] digits) {
        
        HashSet<Integer> set = new HashSet<>();

        int n = digits.length;

        for(int i=0;i<n;i++){
            if(digits[i] == 0) continue;
            for(int j=0;j<n;j++){
                if(i == j) continue;
                for(int k=0;k<n;k++){
                    if(j == k || i == k) continue;
                    int num = digits[i];
                    num = num * 10 + digits[j];
                    num = num * 10 + digits[k];
                    if(num % 2 == 0)set.add(num);
                }
            }
        }

        return set.size();
    }
}