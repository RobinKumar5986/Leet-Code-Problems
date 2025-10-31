class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        boolean[] set = new boolean[nums.length-2];
        int[] ans = new int[2];
        int i = 0;
        for(int ele : nums ) {
            if(!set[ele]){
                set[ele] = true;
            }else{
                ans[i++] = ele;
            }
            if(i > 1)
                return ans;
        }
        return ans;
    }
}