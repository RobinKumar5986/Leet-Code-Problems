class RandomizedCollection {
    List<Integer> map=new ArrayList<>();
    public RandomizedCollection() {
        
    }
    
    public boolean insert(int val) {
        if(!map.contains(val)){
            map.add(val);
            return true;
        }else{
            map.add(val);
            return false;
        }
    }
    
    public boolean remove(int val) {
        if(!map.contains(val))
            return false;
        int ind=map.indexOf(val);
        map.remove(ind);
        return true;
    }
    
    public int getRandom() {
        Random r=new Random();
        return map.get(r.nextInt(map.size()));
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */