class Solution {
    public int reverse(int x) {
        long ans=0;
        boolean flag=false;
        if(x<0)
            flag=true;
        x=Math.abs(x); 
        while(x!=0){
            int temp=x%10;
            ans=ans*10 + temp;
            x=x/10;
        }
        if(flag)ans=ans*(-1);

        if(ans<Integer.MIN_VALUE || ans > Integer.MAX_VALUE) return 0;
        return (int)ans;
    }
}