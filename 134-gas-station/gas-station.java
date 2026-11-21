class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int fule = 0, start = 0;
        int sum = 0;
        for(int i = 0 ; i < gas.length;i++){
            int diff = gas[i] - cost[i];
            fule += diff;
            sum += diff;
            if(fule < 0) {//start is not valid this this current point
                start = i+1;
                fule = 0;
            }
        }
        if(sum < 0)
            return -1;
        return start;
    }
}