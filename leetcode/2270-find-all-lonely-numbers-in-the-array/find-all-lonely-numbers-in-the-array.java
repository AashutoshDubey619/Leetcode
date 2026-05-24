class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> res = new ArrayList<>();

        HashMap<Integer , Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for(int x : nums){
            map.put(x , map.getOrDefault(x , 0)+1);
            set.add(x);
        }

        for(int x : nums){
            if(map.get(x) == 1 && !set.contains(x+1) && !set.contains(x-1))res.add(x);
        }

        return res;
    }
}