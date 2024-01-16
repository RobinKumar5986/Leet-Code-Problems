class RandomizedSet {
    HashMap<Integer,Integer> map;
    List<Integer> list;
    int size=0;
    public RandomizedSet() {
        map=new HashMap<>();
        list=new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(!map.containsKey(val)){
            list.add(val);
            size++;
            map.put(val,size-1); //Index of the value
            return true;
        }
        return false;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val))
            return false;
        int ele=list.get(size-1);
        int ind=map.get(val);
        list.set(ind,ele);
        map.put(ele,ind);
        list.remove(size-1);
        size--;
        map.remove(val);
        return true;
    }
    
    public int getRandom() {
        Random r=new Random();
        return list.get(r.nextInt(size));
    }
}