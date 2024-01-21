class Solution {
    public int minimumPushes(String word) {
        int len=word.length();
        if(len<=0)return 0;
        int min=0;
        int step=1;
        while(len!=0){
            if(len>8){
                min+=8*step;
                len-=8;
            }else{
                min+=len*step;
                len=0;
            }
            step++;
        }
        return min;
    }
}