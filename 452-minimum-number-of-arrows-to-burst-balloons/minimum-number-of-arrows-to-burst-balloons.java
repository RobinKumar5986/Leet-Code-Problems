class Solution {
    public int findMinArrowShots(int[][] pt) {
        int arrow = 0;
        Arrays.sort(pt,(a,b) -> {
            return Integer.compare(a[1],b[1]);
        });
        
        int max = pt[0][1];

        for(int i = 1; i < pt.length; i++){
            if(max < pt[i][0]) {//case on overlap
                arrow++;
                max = pt[i][1];
            }
        }
        return arrow+1;
    }
}