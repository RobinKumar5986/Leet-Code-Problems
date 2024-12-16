class Solution {
    
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        Queue<int[]> q = new PriorityQueue<>(
            (a,b) -> {
                if( a[0] != b[0])
                    return Integer.compare(a[0],b[0]);
                return Integer.compare(a[1],b[1]);
            }
        );
        for(int i = 0 ; i < nums.length; i++){
            q.add(new int[]{nums[i],i});
        }
        while( k > 0){
            int[] n = q.poll();
            n[0] = n[0] * multiplier;
            q.add(n);
            k--;
        }
        while(!q.isEmpty()){
            int[] n = q.poll();
            nums[n[1]] = n[0];
        }
        return nums;
    }
}