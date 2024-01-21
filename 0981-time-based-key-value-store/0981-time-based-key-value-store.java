class TimeMap {
    HashMap<String,List<Pair<String,Integer>>> map;
    public TimeMap() {
        map=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key))
            map.put(key,new ArrayList<>());
        map.get(key).add(new Pair(value,timestamp));
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";
        List<Pair<String,Integer>> list=map.get(key);
        return search(list,timestamp);
    }
    //Binary Search
    String search(List<Pair<String,Integer>> list,int time){
        int lo=0;
        int hi=list.size()-1;
        String ans="";
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(list.get(mid).getValue()==time)
            {
                return list.get(mid).getKey();
            }else if(list.get(mid).getValue()<time){
                ans=list.get(mid).getKey();
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
        return ans;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */