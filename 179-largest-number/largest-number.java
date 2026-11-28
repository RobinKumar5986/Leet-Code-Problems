class Solution {
    // String ans = "";
    // void genMax(List<Integer> lst){
    //     StringBuilder sb = new StringBuilder();
    //     for(int ele : lst){
    //         sb.append(ele);
    //     }
    //     if(ans == ""){
    //         ans = sb.toString();
    //     }else{
    //         for(int i = 0; i < ans.length(); i++){
    //             if(ans.charAt(i) < sb.charAt(i)){
    //                 ans = sb.toString();
    //                 break;
    //             }else if(ans.charAt(i) > sb.charAt(i)){
    //                 break;
    //             }
    //         }
    //     }
    // }
    // void dfs(int ind,List<Integer> comb,int[] nums,boolean[] seen){
    //     if(ind >= nums.length){
    //         if(comb.size() == nums.length){
    //             genMax(comb);
    //         }
    //         return;
    //     }
    //     for(int i = 0; i < nums.length; i++){
    //         if(seen[i])
    //             continue;

    //         //skip the element
    //         dfs(ind+1,comb,nums,seen);

    //         //take the element (backtracking)
    //         comb.add(nums[i]);
    //         seen[i] = true;
    //         dfs(ind+1,comb,nums,seen);
    //         comb.remove(comb.size()-1);
    //         seen[i] = false;
    //     }
    // }

    //Solution 2
    String getBest(int[] nums,boolean[] seen) {
        String best = "";
        int ind = -1;
        for(int i = 0 ; i < nums.length; i++){
            if(seen[i])
                continue;
            String n = nums[i] + "";
            if(ind == -1 || (n + best).compareTo(best + n) > 0){
                best = n;
                ind = i;
            }
            
        }
        seen[ind] = true;
        return best;
    }
    public String largestNumber(int[] nums) {
        boolean[] seen = new boolean[nums.length];
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < nums.length; i++){
            sb.append(getBest(nums,seen));
        }
        if(sb.charAt(0) == '0')
            return "0";
        return sb.toString();
    }
}