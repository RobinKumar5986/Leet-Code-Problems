class Solution {
    public int maxHeightOfTriangle(int red, int blue) {
        if(red+blue < 3) return 1;
        int r=red;
        int b=blue;
        int ans1=0;
        int ans2=0;
        int c=1;
        boolean flag=true;
        while(c<=red || c<=blue){
            if(flag){
                blue=blue-c;
                if(blue<0)
                    break;
                flag=false;
            }else{
                red=red-c;
                if(red<0)
                    break;
                flag=true;
            }
            ans1++;
            c++;
        }
        red=r;
        blue=b;
        c=1;
        flag=false;
        while(c<=red || c<=blue){
            if(flag){
                blue=blue-c;
                if(blue<0)
                    break;
                flag=false;
            }else{
                red=red-c;
                if(red<0)
                    break;
                flag=true;
            }
            ans2++;
            c++;
        }
        // System.out.println(ans1+ " : "+ ans2);
        return Math.max(ans1,ans2);
    }
}