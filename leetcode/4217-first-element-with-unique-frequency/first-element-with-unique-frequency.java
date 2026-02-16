class Solution {
    public int firstUniqueFreq(int[] nums) {

        HashMap<Integer , Integer> freq = new HashMap<>();
        HashMap<Integer , Integer> freqCount = new HashMap<>();

       
        for(int num : nums){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        
        for(int value : freq.values()){
            freqCount.put(value, freqCount.getOrDefault(value, 0) + 1);
        }

        
        for(int num : nums){
            int f = freq.get(num);
            if(freqCount.get(f) == 1){
                return num;   
            }
        }

        return -1;
    }
}
