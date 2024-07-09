class Solution {
    public double averageWaitingTime(int[][] cust) {
        int ft=0;
        double avg=0;
        for(int i=0;i<cust.length;i++){
            if(ft<cust[i][0])
                ft=cust[i][0];
            ft+=cust[i][1];
            avg+=ft-cust[i][0];
        }
        return avg/cust.length;
    }
}