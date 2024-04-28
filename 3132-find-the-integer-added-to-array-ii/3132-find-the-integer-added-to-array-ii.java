class Solution {
    boolean match(int[] nums1,int[] nums2,int i,int j, int x){
        int[] n=new int[nums2.length];
        int ind=0;
        for(int k=0;k<nums1.length;k++){
            if(k!=i && k!=j){
                n[ind++]=nums1[k]+x;
            }
        }
        Arrays.sort(n);
        Arrays.sort(nums2);
        return Arrays.equals(n,nums2);
    }
    public int minimumAddedInteger(int[] nums1, int[] nums2) {
        
        int sum1=0;
        int sum2=0;
        int ans1=Integer.MAX_VALUE;
        int ans2=Integer.MAX_VALUE;

        for(int ele : nums1)
            sum1+=ele;
        for(int ele : nums2)
            sum2+=ele;
        for(int i=0;i<nums1.length;i++){
            for(int j=i+1; j<nums1.length;j++){
                int temp=sum1;
                temp=temp-nums1[i]-nums1[j];
                int x2= (sum2-temp)/nums2.length;
                if(match(nums1,nums2,i,j,x2) && x2 < ans2)
                    ans2=x2;
            }
        }
        return ans2;
    }
}