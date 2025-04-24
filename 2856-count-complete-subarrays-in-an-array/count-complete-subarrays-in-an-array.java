class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int ans = 0;
        boolean[] set = new boolean[2000 + 1];
        int dest = 0;
        for(int ele : nums){
            if(set[ele] == false){
                dest++;
            }
            set[ele] = true;
        }
        for(int i = 0 ; i < nums.length; i++){
            boolean present[] = new boolean[2001];
            int count = 0;
            for(int j = i ; j < nums.length; j++) {
                if(!present[nums[j]]){
                    count++;
                }
                present[nums[j]] = true;
                if(count == dest)
                    ans++;
            }
        }
        return ans;
    }
}