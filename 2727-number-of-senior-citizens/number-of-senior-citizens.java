class Solution {
    public int countSeniors(String[] details) {
        int ans = 0;
        for(String ele : details){
            String age = ele.charAt(11) +""+ele.charAt(12);
            if(Integer.parseInt(age) > 60)
                ans++;
        }
        return ans;
    }
}