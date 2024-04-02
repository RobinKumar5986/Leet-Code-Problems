class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;

        HashMap<Character,Character> map=new HashMap<>();
        HashMap<Character,Character> map2=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char key=s.charAt(i);
            char val=t.charAt(i);
            if(!map.containsKey(key)){
                map.put(key,val);
            }else{
                char preVal=map.get(key);
                if(val!=preVal)
                    return false;
            }

            char key2=t.charAt(i);
            char val2=s.charAt(i);

            if(!map2.containsKey(key2)){
                map2.put(key2,val2);
            }else{
                char preVal2=map2.get(key2);
                if(val2!=preVal2)
                    return false;
            }
            
            
        }
        return true;
    }
}