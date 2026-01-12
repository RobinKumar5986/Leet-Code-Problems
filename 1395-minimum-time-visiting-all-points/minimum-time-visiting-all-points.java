class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;
        int Xc = points[0][0];
        int Yc = points[0][1];

        for(int i = 1 ; i < points.length; i++){
            int[] point = points[i];
            int Xg = point[0];
            int Yg = point[1];
            
            int X = Math.abs(Xc - Xg);
            int Y = Math.abs(Yc - Yg);
            
            int min = Math.min(X,Y);
            int max = Math.max(X,Y);

            time += min;
            time += max - min;

            Xc = Xg;
            Yc = Yg;
        }
        return time;
    }
}