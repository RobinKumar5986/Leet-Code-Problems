class Solution {
    public int minimumLength(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(char ele : s.toCharArray()){
            map.put(ele,map.getOrDefault(ele,0)+1);
            if(map.get(ele)==3){
                map.put(ele,1);
            }
        }
        int ans=0;
        for(int ele : map.values())
            ans+=ele;
        return ans;
    }
}