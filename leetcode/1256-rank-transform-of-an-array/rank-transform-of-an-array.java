class Solution {
    public int[] arrayRankTransform(int[] arr) {
        
        int ans[] = new int[arr.length];

        if(arr.length == 0) return ans;
        HashMap<Integer , Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        ArrayList<Integer> list = new ArrayList<>();

       for(int x  : arr)set.add(x);

       for(int it : set)list.add(it);

        Collections.sort(list);

        for(int i=0;i<list.size();i++){
            map.put(list.get(i) , i + 1);
        }


        for(int i=0;i<arr.length;i++){
            ans[i] = map.get(arr[i]);
        }

        return ans;
    }
}