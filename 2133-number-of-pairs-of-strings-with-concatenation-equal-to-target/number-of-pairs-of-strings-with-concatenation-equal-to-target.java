class Solution {
    public int numOfPairs(String[] nums, String target) {
        Map<String,Integer> map = new HashMap<>();
        int ans = 0;
        for(String ele : nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        for(int i = 0 ; i< target.length();i++){
            String left = target.substring(0,i);
            String right = target.substring(i);
            if(left.isEmpty() || right.isEmpty())
                continue;
            if(map.containsKey(left) && map.containsKey(right)){
                if(left.equals(right)){
                    ans +=  map.get(left) * (map.get(left) - 1);
                }else{
                    ans += map.get(left) * map.get(right);
                }
            }     
        }
        return ans;
    }
}