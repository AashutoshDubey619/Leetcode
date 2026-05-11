class Solution {
    public int[] separateDigits(int[] nums) {
        
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            ArrayList<Integer> temp = new ArrayList<>();
            int x = nums[i];
            
            while(x > 0){
                temp.add(x % 10);
                x /= 10;
            }

            for(int j=temp.size()-1;j>=0;j--){
                list.add(temp.get(j));
            }
        }

        int [] res= new int[list.size()];

        for(int i=0;i<list.size();i++){
            res[i] = list.get(i);
        }

        return res;
    }
}