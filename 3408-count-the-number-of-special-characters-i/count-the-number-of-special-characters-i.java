class Solution {
    public int numberOfSpecialChars(String word) {
        Set<String> map=new HashSet<>();
        int ans=0;
        for(char c : word.toCharArray()){
            if(c>='a' && c<='z')
                map.add(c+"");
        }
        for(char c : word.toCharArray()){
            if(c>='A' && c<='Z'){
                String s=c+"";
                s=s.toLowerCase();
                if(map.contains(s)){
                    map.remove(s);
                    ans++;
                }
            }
        }
        
        return ans;
    }
}