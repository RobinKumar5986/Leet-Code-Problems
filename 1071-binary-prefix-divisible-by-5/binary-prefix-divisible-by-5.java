class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans = new ArrayList<>();
        int pow = 0;
        long sum = 0;
        for(int ele : nums){
            sum = ((sum << 1) + ele) % 5;
            ans.add(sum == 0);
        }
        return ans;
    }
}