class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {

        List<Boolean> list = new ArrayList<>();

        for(int i=0;i<l.length;i++){
            int left = l[i];
            int right = r[i];

            ArrayList<Integer> sorted = new ArrayList<>();

            while(left <= right){
                sorted.add(nums[left]);
                left++;
            }

            Collections.sort(sorted);

            boolean flag = true;

            int diff = -1;

            for(int j=1;j<sorted.size();j++){
                if(diff != -1 && diff != (sorted.get(j) - sorted.get(j-1))){
                    flag = false;
                    break;
                }
                else diff = sorted.get(j) - sorted.get(j-1);
            }

            list.add(flag);
        }

        return list;
    }
}