class Solution {
    public int minCost(String colors, int[] time) {
        int minTime = 0;
        int prevTime = time[0];
        char prevBallon = colors.charAt(0);
        for(int i = 1; i < time.length ; i++){
            char ballon = colors.charAt(i);
            if(prevBallon == ballon){
                minTime += Math.min(prevTime,time[i]);
                prevTime = Math.max(prevTime,time[i]); 
            }else{
                //no removal
                prevBallon = ballon;
                prevTime = time[i];
            }
        }
        return minTime;
    }
}