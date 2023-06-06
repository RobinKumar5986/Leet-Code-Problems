class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff=arr[1]-arr[0];
        for(int i=1;i<arr.length;i++){
            int tDif=arr[i]-arr[i-1];
            if(diff!=tDif){
                return false;
            }
        }
        return true;
    }
}