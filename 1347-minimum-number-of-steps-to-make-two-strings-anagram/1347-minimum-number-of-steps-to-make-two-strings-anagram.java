class Solution {
    Map<Character,Integer> mapper(Map<Character,Integer> map,String s){
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0) +1 );
        }
        return map;
    }
    public int minSteps(String s, String t) {
        if(s.length()!=t.length()) return -1;

        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        map1=mapper(map1,s);
        map2=mapper(map2,t);
        int steps=0;
        int unique=0;
        for(Map.Entry<Character,Integer> ele : map1.entrySet()){
            char key=ele.getKey();
            int val=ele.getValue();
            if(map2.containsKey(key)){
                System.out.print(key + " : "+val);
                int val2=map2.get(key);
                if(val<val2)
                    steps+=val2-val;
                else
                    steps+=val-val2;
            }else{
                unique+=val;
            }       
        }
        for(Map.Entry<Character,Integer> ele : map2.entrySet()){
            char key=ele.getKey();
            int val=ele.getValue();
            if(!map1.containsKey(key))
                unique+=val;
        }
        System.out.println("\nUnique : "+unique);
        steps+=unique;
        return steps/2;
    }
}