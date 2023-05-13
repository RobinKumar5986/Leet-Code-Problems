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
        Set<List<Integer>> lst = new HashSet<>();
        Arrays.sort(nums);                 // Importent
        if(nums.length<3){ return new ArrayList(lst);}

        for(int i=0;i<nums.length-2;i++){
            int val=nums[i];
            int lower=i+1;
            int upper=nums.length-1;
            while(lower<upper){
                int sum=val+nums[lower]+nums[upper];
                if(sum==0){
                    lst.add(Arrays.asList(val,nums[lower],nums[upper]));
                    lower++;
                }else if(sum<0){
                    lower++;
                }else{
                    upper--;
                }
            }

        }
        return new ArrayList(lst) ;

    }
}