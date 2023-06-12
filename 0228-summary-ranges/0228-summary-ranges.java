class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res=new ArrayList<>();

        if (nums.length==0) return res;

        int p1=0;
        int exp=nums[0]+1;
        boolean flag=true;
        for(int i=1;i<nums.length;i++){

            if(exp!=nums[i]){
                flag=false;

                if(p1+1!=i){
                    res.add(nums[p1]+"->"+nums[i-1]);
                    exp=nums[i];
                    p1=i;
                }else{
                    res.add(nums[p1]+"");
                    p1=i;
                    exp=nums[i];
                }
            }
            exp++;

        }
        if(flag){
            if(nums.length==1){
                res.add(nums[0]+"");
            }else{
                res.add(nums[0]+"->"+nums[nums.length-1]);
            }
            return res;
        }
        if(p1+1<=nums.length-1){
            res.add(nums[p1]+"->"+nums[nums.length-1]);
        }else{
            res.add(nums[p1]+"");
        }
        return res;
    }
} 