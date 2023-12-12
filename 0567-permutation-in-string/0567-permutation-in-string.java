class Solution {
    HashMap<Character,Integer> freq(HashMap<Character,Integer> map,String s){
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0) +1);
        }
        return map;   
    }
    boolean check(HashMap<Character,Integer> m1,HashMap<Character,Integer> m2){
        for(Map.Entry<Character,Integer> ele : m1.entrySet()){
            char key=ele.getKey();
            int val=ele.getValue();
            if(!m2.containsKey(key)){
                return false;
            }
            if(m2.containsKey(key) && val!=m2.get(key)){
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length() < s1.length() ) return false;
        int lo=0;
        int hi=s1.length();
        HashMap<Character,Integer> m1=new HashMap<>();
        HashMap<Character,Integer> m2=new HashMap<>();
        m1=freq(m1,s1);
        for(int i=0;i<s2.length()-hi + 1;i++){
            String sub=s2.substring(lo+i,hi+i);
            m2.clear();
            m2=freq(m2,sub);
            if(check(m1,m2)) return true;            
        }

        return false;        
    }
}