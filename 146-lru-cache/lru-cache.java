class LRUCache {
    class Node {
        Node next;
        Node prev;
        int key;
        int value;
    }
    int max = 0;
    Node head = null;
    Node tail =  null;
    int size = 0;
    boolean[] keys = new boolean[1_00_00_0 +1];

    public LRUCache(int capacity) {
        max = capacity;

    }
    
    public int get(int key) {
        Node itr = head;
        int ans = -1;
        while(itr != null){
            if(itr.key == key){
                ans = itr.value;
                if(itr == tail)
                    break;
                tail.next = itr;
                if(itr.prev == null){
                    head = itr.next;
                    head.prev = null;
                }else{
                    if(itr.next != null){
                        itr.prev.next = itr.next;
                        itr.next.prev = itr.prev;
                    }
                }
                itr.prev = tail;
                tail = itr;
                tail.next = null;

            }
            itr = itr.next;
        }
        
        return ans;
    }

    public void update(int key,int value) {
        Node itr = head;
        while(itr != null){
            if(itr.key == key){
                itr.value = value;
                if(itr == tail)
                    break;
                tail.next = itr;
                if(itr.prev == null){
                    head = itr.next;
                    head.prev = null;
                }else{
                    if(itr.next != null){
                        itr.prev.next = itr.next;
                        itr.next.prev = itr.prev;
                    }
                }
                itr.prev = tail;
                tail = itr;
                tail.next = null;

            }
            itr = itr.next;
        }
    }

    public void put(int key, int value) {
        if(keys[key]){
            update(key,value);
            return;
        }
        //now key we have here 
        Node node = new Node();
        node.key = key;
        node.value = value;

        if(head == null){
            head = node;
            tail = node;
        }else{
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        
        size += 1;
        keys[key] = true;

        if(size > max){
            Node rem = head;
            head = head.next;
            head.prev = null;

            keys[rem.key] = false;
            size -= 1;
        }

    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */