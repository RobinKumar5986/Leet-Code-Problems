class Solution {
    class Pair {
        double key;
        int[] val;

        Pair(double key, int[] val) {
            this.key = key;
            this.val = val;
        }
    }
    public double maxAverageRatio(int[][] classes, int extStud) {
        Queue<Pair> max = new PriorityQueue<>((q1,q2) -> Double.compare(q2.key,q1.key));
        for(int[] ele : classes){
            double pass = ele[0];
            double total = ele[1];
            double change = ((pass + 1) / (total+1)) - (pass/total);

            max.add(new Pair(change,ele));
        }
        while(extStud > 0){
            Pair p = max.poll();
            double pass = p.val[0] + 1;
            double total = p.val[1] + 1;
            double change = ((pass + 1) / (total+1)) - (pass/total);

            max.add(new Pair(change,new int[]{(int)pass,(int)total}));
            extStud--;
        }
        double ans = 0;
        while(!max.isEmpty()){
            Pair p = max.poll();
            ans += (double)p.val[0] / (double)p.val[1];

        }
        return ans/classes.length;
    }
}