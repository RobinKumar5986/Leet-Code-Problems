class Solution { 
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length-k+1];
        int max = Integer.MIN_VALUE;
        Deque<Integer> dq = new LinkedList<>();
        for(int i = 0; i<nums.length; i++) {
            if(!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.pollLast();
            }
            dq.add(i);
            int ind = i - k + 1;
            if(ind >= 0) {
                ans[ind] = nums[dq.peekFirst()];
            }
        }

        return ans;
    }
}