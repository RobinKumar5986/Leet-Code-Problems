class MyHashMap {
    int data[];
    public MyHashMap() {
        this.data=new int[1000001];
        Arrays.fill(data,-1);
    }
    
    public void put(int key, int value) { 
       this.data[key]=value;
    }
    
    public int get(int key) {
        return this.data[key];
    }
    
    public void remove(int key) {
        this.data[key]=-1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */