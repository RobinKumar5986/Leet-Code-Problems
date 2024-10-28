class Solution {
    public int longestSquareStreak(int[] nums) {
        Set<Long> set = new HashSet<>();
        HashMap<Long,Long> map = new HashMap<>();
        int ans = 0;
        for(int i = 0 ; i < nums.length ; i++){
            set.add((long)nums[i]);
        }
        for(int i = 0 ; i < nums.length ; i++){
            long sq = (long)nums[i] * (long)nums[i];
            if(set.contains(sq)){
                map.put((long)nums[i],sq);
            }
        }
        if(map.isEmpty())
            return -1;
        for(Map.Entry<Long,Long> ele : map.entrySet()){
            Long key = ele.getKey();
            Long val = ele.getValue();
            int c = 2;
            while(true){
                if(map.containsKey(val)){
                    val = map.get(val);
                    c++;
                }else{
                   break;
                }
            }
            if(c > ans)
                ans = c;
        }
        return ans;
    }
}