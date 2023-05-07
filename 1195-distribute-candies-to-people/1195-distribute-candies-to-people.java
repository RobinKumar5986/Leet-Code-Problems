class Solution {
    public int[] distributeCandies(int candies, int np) { 

        int[] dis=new int[np];
        int rem=candies;
        int exp=1;
        int i=0;
        while(rem>0){
            if(exp<=rem){
                dis[i]=dis[i]+exp;
                rem=rem-exp;
                i++;
                exp++;
            }else{
                dis[i]=dis[i]+rem;
                return dis;
            }
            if(i==np){
                i=0;
            }
        }

        return dis;

    }
}