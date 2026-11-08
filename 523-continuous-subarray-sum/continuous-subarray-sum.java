class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int[] pxSum = new int[nums.length];
        pxSum[0] = nums[0];
        for(int i = 1; i<nums.length; i++){
            pxSum[i] = pxSum[i-1] + nums[i];
        }
        Map<Integer,Integer> seen = new HashMap<>();
        seen.put(0,-1);
        for(int i = 0 ; i < nums.length; i++){
            int req = (pxSum[i] % k);
            if(seen.containsKey(req)){
                if(i - seen.get(req) >= 2){
                    return true;
                }
            }else{
                seen.put(req,i);
            }
        }
        return false;
    }
}