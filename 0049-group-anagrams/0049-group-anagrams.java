class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length; i++){
            String s=strs[i];

            char[] letters=s.toCharArray(); //converting the array 
            Arrays.sort(letters);           //sorting the array
            s=new String(letters);          //converting back to String

            if(!map.containsKey(s)){
                List<String> group=new ArrayList<>();
                group.add(strs[i]);
                map.put(s,group);
            }
            else{
                List<String> group=map.get(s);
                group.add(strs[i]);
                map.put(s,group);
            }


        }
        
        return new ArrayList<>(map.values());
    }
}