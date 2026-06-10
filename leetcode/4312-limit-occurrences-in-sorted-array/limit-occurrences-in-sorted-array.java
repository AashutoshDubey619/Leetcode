class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        
        ArrayList<Integer> list = new ArrayList<>();

        int[] freq = new int[101];

        HashSet<Integer> set = new HashSet<>();

        for(int x : nums){
            set.add(x);
            freq[x]++;
        }

        for(int x : nums){
           int count = 0;

           while(set.contains(x) && freq[x] != 0 && count<k){
                list.add(x);
                freq[x]--;
                count++;
           }

            set.remove(x);
        }

        int[] res = new int[list.size()];

        for(int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }

        return res;
    }
}