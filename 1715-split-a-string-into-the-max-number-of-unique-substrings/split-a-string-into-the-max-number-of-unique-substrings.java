class Solution {
    int max = 0;
    int len = 0;
    void tracker(int ind ,String s, Set<String> set){
        if( ind >= len){
            max = Math.max(max, set.size());
            return;
        }
        for(int i = ind ; i < len ; i++){
            String str = s.substring(ind, i + 1);
            if(!set.contains(str)){
                set.add(str);
                tracker(i+1,s,set);
                set.remove(str);
            }
        }
    }
    public int maxUniqueSplit(String s) {
        len = s.length();
        tracker(0,s,new HashSet<>());
        return max;
    }
}