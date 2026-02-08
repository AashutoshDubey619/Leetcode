import java.util.Random;

class Solution {

    int[] org;
    int[] n;
    Random rand = new Random();

    public Solution(int[] nums) {
        org = nums.clone();   
        n = nums.clone();     
    }

    public int[] reset() {
        n = org.clone();      
        return n;
    }

    public int[] shuffle() {
        for (int i = n.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1); 
            int temp = n[i];
            n[i] = n[j];
            n[j] = temp;
        }
        return n;
    }
}
