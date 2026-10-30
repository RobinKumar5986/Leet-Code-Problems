class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans = 0;
        int[] pxSum = new int[nums.length];
        pxSum[0] = nums[0];
        for(int i = 1 ; i < nums.length; i++){
            pxSum[i] = nums[i] + pxSum[i-1];
        }
        
        Map<Integer,Integer> prevSum = new HashMap<>();
        prevSum.put(0,1);
        for(int i = 0 ; i < nums.length; i++ ){
            int px = pxSum[i];
            int req = px - k;
            if(prevSum.containsKey(req)){
                ans += prevSum.get(req);
            }
            prevSum.put(px,prevSum.getOrDefault(px,0)+1);
        }
        
        return ans;
    }
}