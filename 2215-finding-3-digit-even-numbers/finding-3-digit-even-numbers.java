class Solution {
    public int[] findEvenNumbers(int[] dig) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int ele : dig){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        List<Integer> ANS = new ArrayList<>();
        for(int i = 100 ; i < 999 ; i += 2 ){
            int d1 = i % 10;
            int d2 = (i/10) % 10;
            int d3 = (i/100) % 10;
            if(!map.containsKey(d1) || !map.containsKey(d2) || !map.containsKey(d3))    
                continue;
            boolean flag = false;
           
            //d1
            if(map.get(d1) <= 0)
                flag = true;
            map.put(d1 , map.get(d1)-1);
            //d2
            if(map.get(d2) <= 0)
                flag = true;
            map.put(d2 , map.get(d2)-1);
            //d3
            if(map.get(d3) <= 0)
                flag = true;
            map.put(d3 , map.get(d3)-1);
            if(!flag)
                ANS.add(i);
            map.put(d1 , map.get(d1)+1);
            map.put(d2 , map.get(d2)+1);
            map.put(d3 , map.get(d3)+1);
        }
        int[] ans = new int[ANS.size()];
        for(int i = 0; i < ANS.size() ; i++ ){
            ans[i] = ANS.get(i);
        }
        return ans;
    }
}