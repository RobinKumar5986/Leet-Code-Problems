class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        HashMap<Character,List<Integer>> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!map.containsKey(c)){
                List<Integer> ind=new ArrayList<>();
                ind.add(i);
                map.put(c,ind);
            }else{
                List<Integer> ind=map.get(c);
                ind.add(i);
                map.put(c,ind);
            }
        }
        int max=-1;
        for(Map.Entry<Character,List<Integer>> ele : map.entrySet()){
            List<Integer> lst=ele.getValue();
            if(lst.size()>1){
                lst.sort(null);
                int first=lst.get(0);
                int last=lst.get(lst.size()-1);

                int temp=last-first-1;
                if(temp>max)max=temp;
            }
        }
        return max;
    }
}