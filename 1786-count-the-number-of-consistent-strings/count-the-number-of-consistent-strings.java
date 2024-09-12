class Solution {
    boolean[] mapper(String s){
        boolean[] map = new boolean[26];
        for(char c : s.toCharArray()){
            map[c - 'a'] = true;
        }
        return map;
    }
    public int countConsistentStrings(String allowed, String[] words) {
        int ans = 0;
        boolean[] allowedMap = mapper(allowed);
        for(String ele : words){
            boolean[] wordMap = mapper(ele);
            boolean flag = true;
            for(int i = 0 ; i<26 ;i++ ){
                if(wordMap[i] && !allowedMap[i]){
                    flag = false;
                    break;
                }
            }
            if(flag)
                ans++;
        } 
        return ans;      
    }
}