class MyCalendar {
    Set<int[]> set = new HashSet<>();
    public MyCalendar() {
        
    }
    
    public boolean book(int start, int end) {
        for(int[] ele : set){
            if(start >= ele[0] && start < ele[1])
                return false;
            if(end > ele[0] && start < ele[1])
                return false;   
        }
        int[] s = new int[2];
        s[0] = start;
        s[1] = end;
        set.add(s);
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */