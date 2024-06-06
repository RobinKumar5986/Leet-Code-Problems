class Solution {
    public boolean isNStraightHand(int[] hand, int grp) {
        if(hand.length%grp!=0) return false;

        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int ele : hand)
            map.put(ele,map.getOrDefault(ele,0)+1);

        for(int j=0;j<hand.length/grp;j++){
            int key;
            // if(!map.isEmpty())
                key=map.firstKey();
            // else
            //     return false;
            
            if(map.get(key)<=1)
                map.remove(key);
            else
                map.put(key,map.get(key)-1);

            for(int i=0;i<grp-1;i++){
                key++;
                if(!map.containsKey(key))
                    return false;
               
                if(map.get(key)<=1)
                    map.remove(key);
                else
                    map.put(key,map.get(key)-1);       
            }
        }
        return true;
    }
}