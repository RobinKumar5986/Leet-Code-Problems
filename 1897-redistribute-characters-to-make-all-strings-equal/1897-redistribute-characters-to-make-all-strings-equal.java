class Solution {
    void frequency(HashMap<Character,Integer> map,String str){
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
    }
    public boolean makeEqual(String[] words) {
        HashMap<Character,Integer> map=new HashMap<>();
        
        for(int i=0;i<words.length;i++){
            frequency(map,words[i]);
        }
        int len=words.length;
        for(Map.Entry<Character,Integer> ele : map.entrySet()){
            if(ele.getValue()%len !=0) return false;
        }
        return true;   
    }
}