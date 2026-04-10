class Solution {
    public int minimumDistance(int[] nums) {
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        for(int i=0;i<nums.length;i++)list.add(new ArrayList<>());

        for(int i=0;i<nums.length;i++){
            list.get(nums[i]-1).add(i);
        }
        
        int min_dist = Integer.MAX_VALUE;
        for(int l=0;l<list.size();l++){
            if(list.get(l).size() >=3){
                int i = 0;
                int j = 1;
                int k = 2;
                while(k < list.get(l).size()){
                    int i2 = list.get(l).get(i);
                    int j2 = list.get(l).get(j);
                    int k2 = list.get(l).get(k);
                    min_dist = Math.min(min_dist , Math.abs(i2-j2) + Math.abs(j2-k2) + Math.abs(k2-i2));
                    i++;
                    j++;
                    k++;
                }
            }
        }

        return (min_dist == Integer.MAX_VALUE) ? -1 : min_dist ;
    }
}