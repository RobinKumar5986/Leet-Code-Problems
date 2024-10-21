class Solution {
    int max = 0;
    int len = 0;
    void tracker(int ind ,String s, Set<String> set){
        if( ind >= len){
            if(set.size() > max){
                max = set.size();
            }
            return;
        }
        String str = "";
        for(int i = ind ; i < len ; i++){
            str += s.charAt(i);
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