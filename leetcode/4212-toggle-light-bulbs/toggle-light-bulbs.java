class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        List<Integer> res = new ArrayList<>();

        for(int i = 0; i < bulbs.size(); i++){
            int val = bulbs.get(i);

            if(!res.contains(val)) 
                res.add(val);
            else 
                res.remove(Integer.valueOf(val));  
        }

        Collections.sort(res);
        return res;
    }
}
