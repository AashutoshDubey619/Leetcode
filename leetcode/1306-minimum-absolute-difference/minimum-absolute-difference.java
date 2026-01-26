class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        
        List<List<Integer>> res = new ArrayList<>();
        
        int mindif = Integer.MAX_VALUE;

        Arrays.sort(arr);

        for(int i=1;i<arr.length;i++){
            mindif = Math.min(mindif , Math.abs(arr[i] - arr[i-1]));
        }

        for(int i=1;i<arr.length;i++){
            if(Math.abs(arr[i] - arr[i-1]) == mindif){
                res.add(Arrays.asList(arr[i-1], arr[i]));
            }
        }

        return res;
    }
}