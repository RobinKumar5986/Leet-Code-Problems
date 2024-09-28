class MyCircularDeque {
    class Node{
        int val;
        Node prev;
        Node next;
        Node(int val){
            this.val = val;
            this.prev = null;
            this.next = null;
        }

    }
    int k;
    int c=0;
    Node fst = null;
    Node lst = null;
    public MyCircularDeque(int k) {
        this.k = k;
    }
    
    public boolean insertFront(int value) {
        if(c >= k){
            return false;
        }
        else{
            Node n = new Node(value);
            if( c == 0 ){
                fst = n;
                lst = n; 
            }else{
                n.next = fst;
                fst.prev = n;
                fst = n;
            }
            c++;
            return true;
        }
    }
    
    public boolean insertLast(int value) {
        if( c >= k){
            return false;
        }else{
            Node n = new Node(value);
            if( c == 0 ){
                fst = n;
                lst = n;
            }else{
                n.prev = lst;
                lst.next = n;
                lst = n;
            }
            c++;
            return true;
        }
    }
    
    public boolean deleteFront() {
        if(c <= 0){
            return false;
        }else{
            fst = fst.next;
            if(fst != null){
                fst.prev = null;
            }
            c--;
            return true;
        }
    }
    
    public boolean deleteLast() {
        if(c <= 0){
            return false;
        }else{
            lst = lst.prev;
            if(lst != null){
                lst.next = null;
            }
            c--;
            return true;
        }
    }
    
    public int getFront() {
        if(c <= 0){
            return -1;
        }else{
            return fst.val;
        }
    }
    
    public int getRear() {
        if( c <= 0){
            return -1;
        }else{
            return lst.val;
        }
    }
    
    public boolean isEmpty() {
        return c <= 0;
    }
    
    public boolean isFull() {
        return c == k;
    }
}
