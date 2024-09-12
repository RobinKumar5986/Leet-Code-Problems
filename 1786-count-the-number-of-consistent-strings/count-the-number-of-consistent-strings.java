class Solution {
    boolean[] mapper(String s){
        boolean[] map = new boolean[26];
        for(char c : s.toCharArray()){
            map[c - 'a'] = true;
        }
        return map;
    }
    boolean check(String ele , boolean[] allowedMap){
        boolean flag = true;
        for(char c : ele.toCharArray()){
            if(!allowedMap[c - 'a']){
                flag = false;
                break;
            }
        }
        return flag;
    }
    public int countConsistentStrings(String allowed, String[] words) {
        int ans = 0;
        boolean[] allowedMap = mapper(allowed);
        for(String ele : words){
            boolean flag = check(ele,allowedMap);
            if(flag)
                ans++;
        } 
        return ans;      
    }
}