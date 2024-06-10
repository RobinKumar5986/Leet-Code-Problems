class Solution {
    public int heightChecker(int[] hi) {
        int ans=0;
        int[] exp=new int[hi.length];
        for(int i=0;i<hi.length;i++){
            exp[i]=hi[i];
        }
        Arrays.sort(exp);
        for(int i=0;i<hi.length;i++)
            if(hi[i]!=exp[i])
                ans++;
        return ans; 
    }
}