class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] pxSum = new int[nums.length];
        pxSum[0] = (nums[0]%k + k) % k;
        for(int i = 1; i < nums.length; i++){
            pxSum[i] = (( pxSum[i-1] + nums[i] )%k + k) % k;
            // System.out.println("pxSum:" + pxSum[i]);
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int ans = 0;
        for(int i = 0 ; i < nums.length;i++){
            int sum = pxSum[i];
            if(map.containsKey(sum)){
                // System.out.println(sum + " : " + i );
                ans += map.get(sum);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}