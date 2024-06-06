class Solution {
    public List<Boolean> kidsWithCandies(int[] candi, int ext) {
        int max=Integer.MIN_VALUE;
        for(int ele : candi)
            if(max<ele)
                max=ele;
        List<Boolean> ans=new ArrayList<Boolean>();
        for(int ele : candi){
            if(ele+ext >= max)
                ans.add(true);
            else
                ans.add(false);
        }
        return ans;
    }
}