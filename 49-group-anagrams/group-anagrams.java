class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String ele : strs) {
            char[] c = ele.toCharArray();
            Arrays.sort(c);
            StringBuilder sb = new StringBuilder();
            sb.append(c);
            String s = sb.toString();
            if(!map.containsKey(s)) { 
                map.put(s, new ArrayList<>());
            }
            List<String> str = map.get(s);
            str.add(ele);
            map.put(s,str);
        }

        for(Map.Entry<String, List<String>> ele : map.entrySet()){
            List<String> value = ele.getValue();
            ans.add(value);
        }
        return ans;
    }
}