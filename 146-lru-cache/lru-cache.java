class LRUCache {
    class Node {
        Node next;
        Node prev;
        int key;
        int value;
    }
    int max = 0;
    int sz = 0;
    Node start = null;
    Node end = null;
    Map<Integer,Node> map = new HashMap<>();
    public LRUCache(int capacity) {
        max = capacity;
        
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        Node node = map.get(key);
        if(node == end)
            return node.value;
        
        Node pvNode = node.prev;
        Node nxtNode = node.next;
        if(node.key == start.key){
            start = start.next;
        }
        end.next = node;
        node.next = null;
        node.prev = end;
        end = node;
        
        if(pvNode != null){
            pvNode.next = nxtNode;
        }
        if(nxtNode != null){
            nxtNode.prev = pvNode;
        }
        if(start != null) {
            start.prev = null;
        }
        return  end.value;

    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)) {
           Node node =  map.get(key);
           node.value = value;
           get(key);
           return;
        }
        if(sz >= max){
            Node rem = start;
            start = start.next;
            if(start != null){
                start.prev = null;
            }
            map.remove(rem.key);
            Node node = new Node();
            node.key = key;
            node.value = value;
            map.put(key,node);
            if(start == null){
                start = node;
                end = node;
            }else{
                end.next = node;
                node.prev = end;
                end = node;
            }
            

        }else{
            Node node = new Node();
            node.key = key;
            node.value = value;
            map.put(key,node);
            if(start == null){
                start = node;
                end = node;
            }else{
                end.next = node;
                node.prev = end;
                end = node;
            }
            
            sz++;
        }
    }
}