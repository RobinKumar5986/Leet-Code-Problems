class Solution {
    public boolean checkValidCuts(int n, int[][] rct) {
        if(rct.length < 3 ) return false;

        int[][] xs = new int[rct.length][2];
        int[][] ys = new int[rct.length][2];
        for(int i = 0 ; i<rct.length; i++){
            int[] ele = rct[i];
            xs[i][0] = ele[0];
            xs[i][1] = ele[2];

            ys[i][0] = ele[1];
            ys[i][1] = ele[3];
        }
        
        Arrays.sort(xs,(a,b) -> Integer.compare(a[0],b[0]));
        Arrays.sort(ys,(a,b) -> Integer.compare(a[0],b[0]));
        //vertical cut check
        int co = 0;
        int pMax = -1;
        for(int i = 1; i< xs.length ;i++){
            pMax = Math.max(xs[i-1][1],pMax);
            if(pMax <= xs[i][0])
                co++;
            if(co >= 2)
                return true;
        }
        co = 0;
        pMax = -1;
        //horizontal cut check
        for(int i = 1; i< ys.length ;i++){
            pMax = Math.max(ys[i-1][1],pMax);
            if(pMax <= ys[i][0])
                co++;
            if(co >= 2)
                return true;
        }
        return false;
    }
}