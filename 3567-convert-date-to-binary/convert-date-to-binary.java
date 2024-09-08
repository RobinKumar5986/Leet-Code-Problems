class Solution {
    public String convertDateToBinary(String date) {
        String[] nums = date.split("-");
        String ans = "";
        for(String ele : nums){
            int n = Integer.parseInt(ele);
            ans+= Integer.toBinaryString(n);
            ans+="-";
        }
        return ans.substring(0,ans.length()-1);
    }
}