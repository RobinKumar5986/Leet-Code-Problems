class Solution {
    public int tupleSameProduct(int[] nums) {
        Map<Long,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++){
            for(int j = i+1; j<nums.length ; j++){
                long mul = nums[i]*nums[j];
                map.put(mul,map.getOrDefault(mul,0)+1);
            }
        }
        int ans = 0;
        for(Map.Entry<Long , Integer> ele : map.entrySet()){
            int count = ele.getValue();
            if(count > 1){
                ans += (count * (count - 1) / 2) * 8;
            }
        }
        return ans;
    }
}