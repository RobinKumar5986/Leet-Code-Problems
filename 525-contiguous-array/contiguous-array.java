class Solution {
    public int findMaxLength(int[] nums) {
        int[] pxSum = new int[nums.length+1];
        for(int i = 1 ; i < nums.length+1; i++){
            if(nums[i-1] == 0){
                pxSum[i] = pxSum[i-1] - 1;
            }else{
                pxSum[i] = pxSum[i-1] + 1;
            }
        }

        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,0);
        int ans = 0;
        for(int i = 1; i < pxSum.length; i++){
            int sum = pxSum[i];
            
            if(map.containsKey(sum)){
                int ind = map.get(sum);
                ans = Math.max(ans,i - ind);
            }else{
                map.put(sum,i);
            }
        }
        return ans;
    }
}