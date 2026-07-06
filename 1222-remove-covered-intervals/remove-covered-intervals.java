class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> {
            if(a[0] == b[0]){
                return b[1] - a[1];
            }
            return a[0] - b[0];
        });
        int ans = intervals.length;
        int maxInd = 0;
        for(int[] ele : intervals){
            if(ele[1] <= maxInd){
                ans--;
            }else{
                maxInd = ele[1];
            }
        }
        return ans;
    }
}