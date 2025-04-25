class Solution {
    public long countInterestingSubarrays(List<Integer> nums, int mod, int k) {
        long ans = 0;
        long sum = 0;
        Map<Long,Long> map = new HashMap<>();
        map.put(0L, 1L); 

        for(int num : nums){
            if(num % mod == k)
                sum++;
            long m = sum % mod;
            long req = (m + mod - k) % mod;
            ans += map.getOrDefault(req , 0L);
            map.put(m , map.getOrDefault(m,0L)+1L);
        }
        return ans;
    }
}