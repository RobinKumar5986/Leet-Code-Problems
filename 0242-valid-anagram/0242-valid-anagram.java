class Solution {
    public boolean isAnagram(String s, String t) {
//---------Brute Force Using Mapping---------//
        if(s.length()!=t.length() || s.length()<1) return false;
        HashMap<Character,Integer> map1=new HashMap<>();
        //-------Mapping--------//
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);

            map1.put(c1,map1.getOrDefault(c1,0)+1);
            map1.put(c2,map1.getOrDefault(c2,0)-1);
        }
        //--------Matching-------//
        for(int val : map1.values()){
            if(val!=0) return false;
        }
        return true;
    }
}