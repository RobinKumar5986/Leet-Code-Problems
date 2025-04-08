class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int ans = 0;
        int lo = 0;
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])){
                while(set.contains(nums[i]) && lo < nums.length){
                    ans++;
                    for(int j=0 ; j < 3 ; j++){
                        if(lo >= nums.length)
                            break;
                        set.remove(nums[lo]);
                        lo++;
                    }
                }
            }
            if(lo > i)
                i = lo;
            if(lo >= nums.length)
                break;
            set.add(nums[i]);
        }
        return ans;
    }
}