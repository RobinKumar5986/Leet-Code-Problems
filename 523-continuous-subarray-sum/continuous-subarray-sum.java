class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int[] pxSum = new int[nums.length];
        pxSum[0] = nums[0]%k;
        for(int i = 1; i < nums.length; i++){
            pxSum[i] = (pxSum[i-1] + nums[i])%k;
        }
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i = 0 ; i < nums.length; i++){
            int sum = pxSum[i];
            if(map.containsKey(sum)){
                if(i - map.get(sum) >= 2)
                    return true;
            }else{
                map.put(sum,i);
            }
            
        }
        return false;
    }
}