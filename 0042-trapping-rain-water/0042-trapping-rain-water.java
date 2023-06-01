class Solution {
    public int trap(int[] height) {
        int left[]=new int[height.length];
        int reight[]=new int[height.length];
        left[0]=height[0];
        for(int i=1;i<left.length;i++){
            left[i]=Math.max(height[i],left[i-1]);
            // System.out.println(max);
        }
        reight[height.length-1]=height[height.length-1];
        for(int i=reight.length-2;i>=0;i--){
            reight[i]=Math.max(height[i],reight[i+1]);
            System.out.println(Math.max(height[i],reight[i+1]));
        }
        int water=0;
        for(int i=0;i<left.length;i++){
            water+=Math.min(left[i],reight[i])-height[i];
        }
        return water;
    }
}