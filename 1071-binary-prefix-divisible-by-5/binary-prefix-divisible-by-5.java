class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans = new ArrayList<>();
        int pow = 0;
        long sum = 0;
        for(int ele : nums){
            sum = (sum * 2 + ele) % 5;
            if(sum % 5 == 0)
                ans.add(true);
            else
                ans.add(false);
        }
        return ans;
    }
}