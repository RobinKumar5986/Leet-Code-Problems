class Solution {
    public int areaOfMaxDiagonal(int[][] dim) {
        int maxAr=0;
        double maxDig=0;
        for(int i=0;i<dim.length;i++){
            double m=Math.sqrt(dim[i][0]*dim[i][0] + dim[i][1]*dim[i][1]);
            if(m>maxDig){
                maxDig=m;
                // System.out.println(maxDig);
            }
        }
        for(int i=0;i<dim.length;i++){
            double m=Math.sqrt(dim[i][0]*dim[i][0] + dim[i][1]*dim[i][1]);
            if(m==maxDig){
                int ar=dim[i][0]*dim[i][1];
                if(ar>maxAr){
                    maxAr=ar;
                    // System.out.println("Area : "+maxAr);
                }
            }
        }
        return maxAr;
    }
}