class Solution {
    public int search(int[] nums, int target) {
//--------------in O(n) brute force---------------//
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==target){
        //         return i;
        //     }
        // }
        // return -1
//------------in O(n/2) in worst case-----------//
        // int start=0;
        // int last=nums.length-1;
        // while(start<=last){
        //     if(nums[start]==target){
        //         return start;
        //     }
        //     if(nums[last]==target){
        //         return last;
        //     }
        //     start++;
        //     last--;
        // }
        // return -1;

//------optimal solution in O(log(n)) binary rearch---------//

        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)>>1;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[start]<=nums[mid]){
                if(target>=nums[start] && target<=nums[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(target>=nums[mid] && target<=nums[end]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}