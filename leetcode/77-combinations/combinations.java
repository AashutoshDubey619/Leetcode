class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();

        comb(1 ,n , k , res , new ArrayList<>());

        return res;
    }

    public void comb(int i ,int n , int k , List<List<Integer>> res , ArrayList<Integer> list){
        if(list.size() == k){
            res.add(new ArrayList<>(list));
            return;
        }

        if(i > n)return;

        list.add(i);
        comb(i + 1 , n , k , res , list);
        list.remove(list.size()-1);
        comb(i + 1 , n , k , res , list);
    }
}