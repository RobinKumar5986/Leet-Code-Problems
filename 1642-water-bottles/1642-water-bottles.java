class Solution {
    public int numWaterBottles(int nb, int ne) {
        int ans=nb;
        int inH=nb;
        while(inH >= ne){
            int rem=inH % ne;
            int fac=inH / ne;
            ans+=fac;
            inH=rem+fac;
        }
        return ans;
    }
}