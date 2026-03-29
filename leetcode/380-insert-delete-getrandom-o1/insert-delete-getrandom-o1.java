class RandomizedSet {
    HashSet<Integer> set ;
    ArrayList<Integer> list;
    Random rand;

    public RandomizedSet() {
        set = new HashSet<>();
        list = new ArrayList<>();
        rand = new Random();
    }
    
    public boolean insert(int val) {
        if(!set.contains(val)){
            set.add(val);
            list.add(val);
            return true;
        }

        return false;
    }
    
    public boolean remove(int val) {
        if(set.contains(val)){
            set.remove(val);
            list.remove(list.indexOf(val));
            return true;
        }

        return false;
    }
    
    public int getRandom() {
        int index = rand.nextInt(list.size());
        return list.get(index);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */