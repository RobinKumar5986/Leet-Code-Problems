class MyHashSet {
    List<Integer> lst=new ArrayList<>();


    public MyHashSet() {
    }
    
    public void add(int key) {
        if(!lst.contains(key)){
            lst.add(key);
        }
    }
    
    public void remove(int key) {
        lst.remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        if(lst.contains(key)){
            return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */