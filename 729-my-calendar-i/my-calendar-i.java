class MyCalendar {
    TreeMap<Integer,Integer> map = new TreeMap<>();
    public MyCalendar() {
        
    }
    
    public boolean book(int start, int end) {
        map.put(start,map.getOrDefault(start,0)+1);
        map.put(end,map.getOrDefault(end,0)-1);
        int sum = 0;
        for(int ele : map.keySet()){
            sum += map.get(ele);
            // System.out.println(sum + " : "+ele );
            if(sum >= 2){
                map.put(start,map.getOrDefault(start,0)-1);
                map.put(end,map.getOrDefault(end,0)+1);
                return false;
            }
        }
        // System.out.println();
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */