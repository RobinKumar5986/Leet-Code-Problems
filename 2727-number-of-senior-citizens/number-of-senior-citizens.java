class Solution {
    public int countSeniors(String[] details) {
        int ans = 0;
        for(String ele : details){
            String age = ele.substring(11,13);
            if(Integer.parseInt(age) > 60)
                ans++;
        }
        return ans;
    }
}