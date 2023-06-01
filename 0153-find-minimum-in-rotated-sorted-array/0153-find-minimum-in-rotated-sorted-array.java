class Solution {
    public int findMin(int[] nums) {
//-------Cheat Code----------//
        // Arrays.sort(nums);
        // return nums[0];
        
//-------Brute force O(n/2)---//
        // int start=0;
        // int end=nums.length-1;
        // int min=Integer.MAX_VALUE;
        // while(start<=end){
        //     int m=Math.min(nums[start],nums[end]);
        //     min=Math.min(min,m);
        //     start++;
        //     end--;

        // }
        // return min;
//--------Binary Search method------//
        int st=0;
        int ed=nums.length-1;
        if(nums[st]<=nums[ed]) return nums[0]; //array is not rotated 
        int min=Integer.MAX_VALUE;
        int tar=1;
        while(st<=ed){
            int mid=(st+ed)>>1;
            if(nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }else if(nums[mid]<nums[mid-1]){
                return nums[mid];
            }else if(nums[st]<=nums[mid]){
                st=mid+1;
            }else{
                ed=mid-1;
            }
        }
        return -1;

    }
}