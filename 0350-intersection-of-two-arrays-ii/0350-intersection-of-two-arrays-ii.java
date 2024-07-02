class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int map1[] =new int[1000+1];
        int map2[] =new int[1000+1];
        int max=0;
        List<Integer> tempAns=new ArrayList<>();
        for(int ele : nums1){
            map1[ele]++;
            max=Math.max(ele,max);
        }
        for(int ele : nums2){
            map2[ele]++;
            max=Math.max(ele,max);
        }
        for(int i=0;i<=max;i++){
            if(map1[i]==0 || map2[i]==0)
                continue;
            int min=Math.min(map1[i],map2[i]);
            while(min!=0){
                tempAns.add(i);
                min--;
            }
        }
        int[] ans=new int[tempAns.size()];
        int i=0;
        for(int ele:tempAns)
            ans[i++]=ele;
        return  ans;
    }
}