class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long sum = 0;
        for(int ele : chalk){
            sum+=ele;
        }
        long rem = k % sum;
        for(int i=0 ; i < chalk.length ;i++){
            rem -=chalk[i];
            if(rem <0 ){
                return i;
            }
        }
        return 0;
    }
}