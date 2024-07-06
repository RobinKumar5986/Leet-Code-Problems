class Solution {
    public int numberOfAlternatingGroups(int[] color) {
        int[] cc=new int[color.length+2];
        for(int i=0;i<color.length;i++){
            cc[i]=color[i];
        }
        cc[cc.length-1]=color[1];
        cc[cc.length-2]=color[0];

        int ans=0;
        for(int i=0;i<color.length;i++){
            if(cc[i]!=cc[i+1] && cc[i]==cc[i+2])
                ans++;
        }
        return ans;
    }
}