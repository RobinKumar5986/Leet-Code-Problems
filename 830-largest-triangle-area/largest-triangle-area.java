class Solution {
    public double largestTriangleArea(int[][] points) {
        double ans = 0;
        for(int i = 0 ; i < points.length; i++){
            int[] p1 = points[i];
            for(int j = i + 1; j < points.length; j++){
                int[] p2 = points[j];
                for(int k = j+1; k < points.length ; k++){
                    int[] p3 = points[k];
                    
                    double d1 = p1[0] * (p2[1] - p3[1]);
                    double d2 = p2[0] * (p3[1] - p1[1]);
                    double d3 = p3[0] * (p1[1] - p2[1]);
                    
                    double area =  Math.abs( d1 + d2 + d3) / 2;

                    if(area > ans)
                        ans = area;
                }
            }
        }
        return ans;
    }
}