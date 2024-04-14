class Solution {
    void appendChar(StringBuilder sb,char c, int freq){
        for(int i=0;i<freq;i++)
            sb.append(c);
    }
    public String frequencySort(String s) {
        Map<Character,Integer> map=new HashMap<>();
        List<Character> bucket[]=new ArrayList[s.length()+1];
        StringBuilder sb=new StringBuilder();
        for(char c : s.toCharArray())
            map.put(c,map.getOrDefault(c,0)+1);
        for(Map.Entry<Character,Integer> ele : map.entrySet()){
            char val=ele.getKey();
            int  ind=ele.getValue();
            if(bucket[ind]==null)
                bucket[ind]=new ArrayList<>();
            bucket[ind].add(val);  
        }
        for(int i=bucket.length-1;i>=0;i--){
            if(bucket[i]!=null){
                for(char ele : bucket[i] )
                    appendChar(sb,ele,i);
            }
        }
        return new String(sb);
    }
}