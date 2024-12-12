class Solution {
    public long pickGifts(int[] gifts, int k) {
        long sum = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : gifts){
            q.offer(ele);
            sum += ele;
        }
        while(k > 0){
            int num = q.poll();
            int sq = (int)Math.sqrt(num);
            q.offer(sq);
            sum -= num - sq;
            k--;
        }
        return sum;        
    }
}