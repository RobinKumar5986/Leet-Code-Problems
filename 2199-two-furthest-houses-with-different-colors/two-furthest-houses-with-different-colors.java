class Solution {
    public int maxDistance(int[] clr) { 
        int c1 = 0;
        int c2 = -1;
        for(int i = 0 ; i < clr.length; i++) {
            if(clr[i] != clr[c1]){
                c2 = i;
                break;
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < clr.length; i++){
            if(clr[i] != clr[c1]) {
                max = Math.max(max, Math.abs(c1 - i));
            }
            if(clr[i] != clr[c2]) {
                max = Math.max(max, Math.abs(c2 - i));
            }
        }

        return max;

    }
}