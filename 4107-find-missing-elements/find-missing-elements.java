class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean[] set = new boolean[101];
        for(int ele : nums){
            if(min > ele) min = ele;
            if(max < ele) max = ele;
            set[ele] = true;
        }
        List<Integer> ans = new ArrayList<>();
        for(int i= min; i<=max; i++){
            if(!set[i])
                ans.add(i);
        }
        return ans;
    }
}