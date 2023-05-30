class MyHashSet {
    int size=(int)Math.pow(10,6)+1;
    boolean[] map;

    public MyHashSet() {
        map=new boolean[size];
    }
    
    public void add(int key) {
        map[key]=true;
    }
    
    public void remove(int key) {
        map[key]=false;
    }
    
    public boolean contains(int key) {
        if(map[key]){
            return true;
        }
        return false;
        
    }
}

// class MyHashSet {
//     List<Integer> lst=new ArrayList<>();


//     public MyHashSet() {
//     }
    
//     public void add(int key) {
//         if(!lst.contains(key)){
//             lst.add(key);
//         }
//     }
    
//     public void remove(int key) {
//         lst.remove(Integer.valueOf(key));
//     }
    
//     public boolean contains(int key) {
//         if(lst.contains(key)){
//             return true;
//         }
//         return false;
//     }
// }

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */