class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int ans = 0;
        while(low <= high){
            String s = low + "";
            if(s.length() % 2 == 0){
                int s1 = 0;
                int s2 = 0;
                for(int i = 0 ; i < s.length()/2;i++){
                    s1 += Integer.parseInt(s.charAt(i) + "");
                    s2 += Integer.parseInt(s.charAt(i + s.length()/2) + "");
                }
                if(s1 == s2)
                    ans++;
            }
            low++;
        }
        return ans;
    }
}