class Solution {
    public boolean isPossibleDivide(int[] hand, int grp) {
       if(hand.length%grp!=0) return false;

        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int ele : hand)
            map.put(ele,map.getOrDefault(ele,0)+1);

        for(int i=0;i<hand.length/grp;i++){
            int prev=-1;
            int ind=0;
            List<Integer> rem=new ArrayList<>();

            for(Map.Entry<Integer,Integer> ele : map.entrySet()){
                int key=ele.getKey();
                int val=ele.getValue();
                if(prev==-1)
                    prev=key;
                else{
                    if(prev+1!=key)
                        return false;
                    else
                        prev=key;
                }
                if(val<=1)
                    rem.add(key);
                else
                    map.put(key,val-1);
                    
                ind++;
                if(ind==grp)
                    break;
            }
            if(ind!=grp)
                return false;
            for(int ele : rem){
                map.remove(ele);
            }
        }
        return true;
    }
}