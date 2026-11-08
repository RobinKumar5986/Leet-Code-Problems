class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans = 0;
        int[] pxSum = new int[nums.length];
        pxSum[0] = nums[0];
        for(int i = 1; i< pxSum.length; i++){
            pxSum[i] = pxSum[i-1] + nums[i];
            // System.out.println(pxSum[i]);
        }

        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i = 0; i < nums.length; i++){
            int sum = pxSum[i];
            int req = sum - k;
            if(map.containsKey(req)){
                ans += map.get(req);
            }
           
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}