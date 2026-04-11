class Solution {
    public int minimumDistance(int[] nums) {
        
        int min_dist = Integer.MAX_VALUE;
        if(nums.length < 3)return -1;

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i=0;i<nums.length;i++)list.add(new ArrayList<>());

        for(int i=0;i<nums.length;i++){
            list.get(nums[i]-1).add(i);
        }


        for(int l=0;l<list.size();l++){
            int h = 0;
            int r = 2;

            while(r < list.get(l).size()){
                int i = list.get(l).get(h);
                int k = list.get(l).get(r);
                min_dist = Math.min(min_dist , 2*(k-i));
                h++;
                r++;
            }
        }

        return (min_dist == Integer.MAX_VALUE) ? -1 : min_dist;
    }   
}