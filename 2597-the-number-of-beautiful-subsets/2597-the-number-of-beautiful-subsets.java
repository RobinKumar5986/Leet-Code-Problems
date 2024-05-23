class Solution {
    int ans=0;
    boolean isButiful(List<Integer> sub,int k){
        for(int i=0;i<sub.size();i++){
            for(int j=i+1;j<sub.size();j++){
                if(Math.abs( sub.get(i)-sub.get(j) ) == k )
                    return false;
            }
        }
        return true;
    }
    void allSub(int[] nums,int i,List<Integer> sub,int k){
        if(i==nums.length){
            if(sub.size()>0 && isButiful(sub,k)){
                ans++;
            }
            return;
        }
        allSub(nums,i+1,sub,k);
        
        sub.add(nums[i]);
        allSub(nums,i+1,sub,k);
        sub.remove(sub.size()-1);
    }
    public int beautifulSubsets(int[] nums, int k) {
        allSub(nums,0,new ArrayList<>(),k);
        return ans;
    }
}