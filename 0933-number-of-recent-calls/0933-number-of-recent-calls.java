class RecentCounter {
    int record[];
    int end=0;
    int start=0;
    public RecentCounter() {
        this.record=new int[10000];
    }
    
    public int ping(int t) {
        record[ end++ ]=t;
        while(record[start] < t-3000){
            start++;
        }
        return end-start;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */