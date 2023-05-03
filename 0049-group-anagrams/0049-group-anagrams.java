class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
//--------optmized solution----------//
        HashMap<HashMap<Character,Integer> ,ArrayList<String>> bmap=new HashMap<>();


        for(String str : strs ){
            HashMap<Character,Integer> fmap=new HashMap<>();
        
            for(int i=0;i<str.length();i++){
                char c=str.charAt(i);
                fmap.put(c,fmap.getOrDefault(c,0) + 1);
            }

            if(! bmap.containsKey(fmap)){
                ArrayList<String> list=new ArrayList<>();
                list.add(str);
                bmap.put(fmap,list);
            }else{
                ArrayList<String> list=bmap.get(fmap);
                list.add(str);
            }
        }
        List<List<String>> result=new ArrayList<>();
        for(ArrayList<String> val : bmap.values()){
            result.add(val);
        }
        return result;


    }
}