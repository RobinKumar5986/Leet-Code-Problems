class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        for(int ele : nums){
            pq.add(ele);
        }
        int ans = 0;
        for(int i = 0 ;i < k; i++){
            ans = pq.poll();
        }
        return ans;
    }
}