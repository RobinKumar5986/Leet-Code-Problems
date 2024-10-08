class MyCalendarTwo {
    TreeMap<Integer,Integer> map = new TreeMap<>();
    public MyCalendarTwo() { 
    }
    public boolean book(int start, int end) {
        int sum = 0;
        map.put(start,map.getOrDefault(start,0)+1);
        map.put(end,map.getOrDefault(end,0)-1);
        for(int ele : map.values()){
            sum += ele;
            if(sum >= 3){
                map.put(start,map.get(start)-1);
                if (map.get(start) == 0) map.remove(start);
                
                map.put(end,map.get(end)+1);
                if (map.get(end) == 0) map.remove(end);
                return false;
            }
        }
        return true;
    }
}
