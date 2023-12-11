class Solution {
    public int findSpecialInteger(int[] arr) {
        int len=arr.length;
        float p25=len * 0.25f;
        int r=(int)Math.floor(p25);
        for(int i=0;i<= (len-r) ;i++){
            if(arr[i] == arr[i+r] ) return arr[i];
        }
        return -1;
    }
}