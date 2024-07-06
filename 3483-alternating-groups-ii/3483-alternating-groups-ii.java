class Solution {
    public int numberOfAlternatingGroups(int[] color, int k) {
        int[] cc=new int[color.length+k-1];
        int ind=0;
        for(ind=0;ind<color.length;ind++){
            cc[ind]=color[ind];
        }
        for(int i=0;i<k-1;i++){
            cc[ind++]=color[i];
        }
        int flag=0;
        for(int i=1;i<k;i++){
            // System.out.print(cc[i]+" ");
            if(cc[i]==cc[i-1])
                flag++;
        }
        // System.out.println("\n"+flag);
        int lo=1;
        int hi=k;
        int ans=0;
        if(flag==0)
            ans++;
        while(lo<color.length){
            if(cc[lo]==cc[lo-1])
                flag--;
            if(cc[hi]==cc[hi-1])
                flag++;
            if(flag==0)
                ans++;
            lo++;
            hi++;
        }
        return ans;
    }
}