class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        
        List<Integer> res = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int min = 101;
        int max = 0;

        for(int x : nums){
            min = Math.min(x , min);
            max = Math.max(x , max);
            set.add(x);
        }

        for(int i=min+1;i<max;i++){
            if(!set.contains(i))res.add(i);
        }

        return res;
    }
}