class Solution {
    public long findScore(int[] nums) {
        long ans = 0;
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b) -> {
            if(a[0] != b[0]){
                return Integer.compare(a[0],b[0]);
            }
            return Integer.compare(a[1],b[1]);
        });
        for(int i = 0 ; i < nums.length; i++){
            minHeap.offer(new int[]{nums[i],i});
        }
        Set<Integer> vis = new HashSet<>();
        while (!minHeap.isEmpty()) {
            int[] pair = minHeap.poll();
            if(!vis.contains(pair[1])){
                ans += pair[0];
                vis.add(pair[1]);
                vis.add(pair[1]+1);
                vis.add(pair[1]-1);
            }
        }
        return ans;
    }
}