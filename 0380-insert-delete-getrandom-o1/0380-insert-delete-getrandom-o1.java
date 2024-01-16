class RandomizedSet {
    List<Integer> map;
    public RandomizedSet() {
        map=new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(!map.contains(val)){
            map.add(val);
            return true;
        }
        return false;
    }
    
    public boolean remove(int val) {
        if(map.contains(val)){
            map.remove(Integer.valueOf(val));
            return true;
        }
        return false;
    }
    
    public int getRandom() {
        Random r=new Random();
        return map.get(r.nextInt(map.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */