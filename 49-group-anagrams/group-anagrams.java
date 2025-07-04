class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();

        for(String str : strs){
            char[] chr = str.toCharArray();
            Arrays.sort(chr);
            String s = new String(chr);
            if(!map.containsKey(s))
                map.put(s, new ArrayList<>());
            List<String> lst = map.get(s);
            lst.add(str);
            map.put(s,lst);
        }
        for(Map.Entry<String,List<String>> ele : map.entrySet()){
            ans.add(ele.getValue());
        }
        return ans;
    }
}