class Solution {
    public int maxArea(int[] height) {

         /* --------Brute force---------//
        for(int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                if(height[i]<=height[j]){
                    tempWater=height[i]*(j-i);
                }else{
                    tempWater=height[j]*(j-i);
                }
                if(water<=tempWater){
                    water=tempWater;
                }
            }
        }
        */
        int water=0;
        int[] a=height;
        int tempWater=0;
        int pointer1=0;int pointer2=height.length-1;
        while(pointer2!=pointer1){
            if(a[pointer1]<=a[pointer2]){
                tempWater=a[pointer1]*(pointer2-pointer1);
                pointer1++;
            }else{
                tempWater=a[pointer2]*(pointer2-pointer1);
                pointer2--;
            }
            if(water<=tempWater){
                water=tempWater;
            }
        }
        return water;
    }
}