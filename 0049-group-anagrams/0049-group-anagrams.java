class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        for(String ele : strs){
            char[] c=new char[26];
            for(char chr : ele.toCharArray())
                c[chr -'a']++;
            String s=new String(c);
            if(!map.containsKey(s))
                map.put(s,new ArrayList<>());
            List<String> lst=map.get(s);
            lst.add(ele);
            map.put(s,lst);
        }
        for(Map.Entry<String,List<String>> ele : map.entrySet() ){
            ans.add(ele.getValue());
        }
        return ans;
    }
}