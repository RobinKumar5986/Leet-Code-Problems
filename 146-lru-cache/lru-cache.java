class LRUCache {
    LinkedHashMap<Integer,Integer> cache = new LinkedHashMap<>();
    int max = 0;
    public LRUCache(int capacity) {
        max = capacity;
    }
    
    public int get(int key) {
        if(!cache.containsKey(key))
            return -1;
        int val = cache.get(key);
        cache.remove(key);
        cache.put(key,val);

        return val;
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)){
            cache.remove(key);
        }else if(cache.size() >= max){
            cache.pollFirstEntry();
        }
        cache.put(key,value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */