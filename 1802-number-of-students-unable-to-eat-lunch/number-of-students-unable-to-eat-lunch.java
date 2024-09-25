class Solution {
    public int countStudents(int[] students, int[] sw) {
        int ans = 0;
        Queue<Integer> q = new LinkedList<>();
        for(int ele : students){
            q.offer(ele);
        }
        int ind = 0;
        while(!q.isEmpty()){
            int len = q.size();
            for(int i = 0 ;i<len;i++){
                int wish = q.poll();
                if(wish == sw[ind]){
                    ind++;
                }else{
                    q.offer(wish);
                }
            }
            if(q.size() == len)
                break;
            
        }
        return q.size();
    }
}