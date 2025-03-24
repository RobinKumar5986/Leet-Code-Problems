class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings,(a,b) -> Integer.compare(a[0],b[0]));
        int prev = 1;
        boolean flag = true;
        for(int[] ele : meetings){
            if(flag){
                days -= ele[1] - ele[0] + 1;
                flag = false;
            }else{
                if(prev >= ele[0] && prev < ele[1]){
                    days -= (ele[1] - prev);
                }else if(ele[0] > prev){
                    days -= ele[1] - ele[0] + 1;
                }
            }
            prev = Math.max(prev, ele[1]);
        }
        return days;
    }
}