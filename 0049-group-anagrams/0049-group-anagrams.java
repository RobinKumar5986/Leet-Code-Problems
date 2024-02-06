class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        List<List<String>> ans=new ArrayList<>();
        for(String ele : strs){
            List<String> lst=new ArrayList<>();
            
            char[] c=ele.toCharArray();
            Arrays.sort(c);
            String key=new String(c);

            if(!map.containsKey(key))
                map.put(key,lst);
            lst=map.get(key);
            lst.add(ele);
            map.put(key,lst);
        }
        for(Map.Entry<String,List<String>> ele : map.entrySet()){
            ans.add(ele.getValue());
        }
        return ans;
    }
}