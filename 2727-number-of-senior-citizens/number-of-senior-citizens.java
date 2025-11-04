class Solution {
    public int countSeniors(String[] details) {
        int ans = 0;
        for(String ele : details){
            int age = (ele.charAt(11) - '0' )*10 + (ele.charAt(12)- '0');
            
            if(age > 60)
                ans++;
        }
        return ans;
    }
}