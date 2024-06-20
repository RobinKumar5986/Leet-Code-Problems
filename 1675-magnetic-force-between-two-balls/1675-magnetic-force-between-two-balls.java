class Solution {
    public int maxDistance(int[] pos, int m) {
        Arrays.sort(pos);
        int l=1;
        int r=pos[pos.length-1]-pos[0];
        int ans=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(isOk(pos,m,mid)){
                ans=mid;
                l=mid+1;
            }else{
                r=mid-1;
            }
        }        
        return ans; 
    }
    public boolean isOk(int[] pos,int m,int dis){
        long last=Integer.MIN_VALUE;
        int res=0;
        for(int p : pos){
            if(p-last>=dis){
                res++;
                last=p;
            }
        }
        return res>=m;
    }
}