class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        Integer sum = Arrays.stream(arr).reduce(0, Integer::sum);
        int count=0;

        // for(int i=0;i<arr.length;i++){
        //     sum+=arr[i];
        // }
        //First base case 
        if(sum%3!=0) return false;
        int crSum=sum/3;
        sum=0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==crSum){
                count++;
                sum=0;
            }
        }
        // Second Base Case 
        if(count>=3) return true;
        return false;
    }
}