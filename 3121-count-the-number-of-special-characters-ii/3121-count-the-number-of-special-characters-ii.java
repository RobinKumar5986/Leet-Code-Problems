class Solution {
    public int numberOfSpecialChars(String word) {
        Map<String,List<Integer>> map=new HashMap<>();
        int ans=0;
        int i=0;
        for(char c : word.toCharArray()){
            if(c>='a' && c<='z'){
                if(!map.containsKey(c))
                    map.put(c+"",new ArrayList<>());
                map.get(c+"").add(i);
            }
            i++;
        }
        
        i=0;
        for(char c : word.toCharArray()){
            if(c>='A' && c<='Z'){
                String s=c+"";
                s=s.toLowerCase();
                if(map.containsKey(s)){
                    for(int ele : map.get(s)){
                        if(ele<i){
                            ans++;
                        }
                    }
                    map.remove(s);
                }
            }
            i++;
        }
        
        return ans;
    }
}