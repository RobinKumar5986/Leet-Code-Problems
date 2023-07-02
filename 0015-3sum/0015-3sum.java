class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       //List<List<Integer>> lst=new ArrayList<>();
//---------Brute Force-----------//
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         for(int k=j+1;k<nums.length;k++){
        //             if((nums[i]+nums[j]+nums[k])==0&&i!=j&&j!=k&&k!=i){
        //                 Boolean b=true;
        //                 for(int l=0;l<lst.size();l++){
        //                     if((lst.get(l).get(0)==nums[i]&&lst.get(l).get(1)==nums[j]&&lst.get(l).get(2)==nums[k])||
        //                     (lst.get(l).get(0)==nums[i]&&lst.get(l).get(2)==nums[j]&&lst.get(l).get(1)==nums[k])||
        //                     (lst.get(l).get(2)==nums[i]&&lst.get(l).get(0)==nums[j]&&lst.get(l).get(1)==nums[k])||
        //                     (lst.get(l).get(2)==nums[i]&&lst.get(l).get(1)==nums[j]&&lst.get(l).get(0)==nums[k])||
        //                     (lst.get(l).get(1)==nums[i]&&lst.get(l).get(2)==nums[j]&&lst.get(l).get(0)==nums[k])||
        //                     (lst.get(l).get(1)==nums[i]&&lst.get(l).get(0)==nums[j]&&lst.get(l).get(2)==nums[k]))
        //                     {
        //                         b=false;
        //                     }
        //                 }
        //                 if(b){
        //                     lst.add(Arrays.asList(nums[i],nums[j],nums[k]));
        //                 }

        //             }
        //         }
        //     }
        // }
//------------------------------------------------------//
        int target=0;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i] > 0) return ans;
            if(i > 0 && nums[i-1] == nums[i]) continue;

            int j=i+1;
            int k=nums.length-1;
            
            while(j<k){
                int sum= nums[i]+nums[j] + nums[k];
                if(sum < target){
                    j++;
                }else if(sum > target){
                    k--;
                }
                else{
                    
                    ans.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k])));
                        j++;
                    while(j<k && nums[j-1] == nums[j]) {j++;}
                        k--;
                    while(k>j && nums[k+1] == nums[k]) {k--;}
                }
            }
        }
        // ans.addAll(list);
        return ans;
    }
}