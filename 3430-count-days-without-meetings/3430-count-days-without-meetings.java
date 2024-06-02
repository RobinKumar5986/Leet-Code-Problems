class Solution {
    public int countDays(int days, int[][] meet) {
        Arrays.sort(meet, (a, b) -> Integer.compare(a[0], b[0]));
        int ans=0;
        int prev=1;
        boolean flag=true;
        for(int[] ele : meet){
            if(flag){
                if(prev<ele[0])
                    ans+=ele[0]-prev;
                flag=false;
            }
            else{
                if(prev<ele[0])
                    ans+=ele[0]-prev-1;
            }
            if(ele[1]>prev)
                prev=ele[1];
        }
        if(days>prev)
            ans+=days-prev;
        return ans;
    }
}