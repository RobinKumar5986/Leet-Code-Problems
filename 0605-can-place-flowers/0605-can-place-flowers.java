class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
        
        int count=0;
        if(f.length==1 && f[0]==0)
            count++;
        for(int i=0;i<f.length;i++){
            if(i==0 && f[i]==0 && i+1<f.length && f[i+1]==0){
                f[0]=1;
                count++;
            }
            else if(i==f.length-1 && f[i]==0 && i-1>=0 && f[i-1]==0){
                f[i]=1;
                count++;
            }
            else if(f[i]!=1 && i-1 >=0 && f[i-1]==0 && i+1<f.length && f[i+1]==0 ){
                f[i]=1;
                count++;
            }
        }
        if(count>=n)
            return true;
        return false;
    }
}