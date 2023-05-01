class Solution {
    public double average(int[] salary) {
        if(salary.length<3) return -1;
        
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        double sum=0;
        for(int i=0;i<salary.length;i++){
            sum=sum+salary[i];
            if(salary[i]>max){
                max=salary[i];
            }
            if(salary[i]<min){
                min=salary[i];
            }
        }
        sum=(sum-min-max)/(salary.length-2);

        return sum;

    }
}