class Solution {
    public List<String> commonChars(String[] words) {
        Map<String,int[]> map=new HashMap<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){

                String c=words[i].charAt(j)+"";
                if(!map.containsKey(c))
                    map.put(c,new int[words.length]);
                int[] lst=map.get(c);
                lst[i]++;
                map.put(c,lst);
            }
        }
        List<String> ans=new ArrayList<>();
        for(Map.Entry<String,int[]> ele : map.entrySet()){
            Integer min=Integer.MAX_VALUE;
            int[] val=ele.getValue();
            String key=ele.getKey();
            for(int i=0;i<val.length;i++){
                if(val[i]<min)
                    min=val[i];
            }
            for(int i=0;i<min;i++)
                ans.add(key);
        }
        
        return ans;
    }
}