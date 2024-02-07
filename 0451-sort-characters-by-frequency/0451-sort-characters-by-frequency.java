class Solution {
    public String frequencySort(String s) {
        int[] freq=new int[256];
        for(int i=0;i<s.length();i++)
            freq[s.charAt(i)]++;
        String ans="";
        for(int i=0;i<256;i++){
            int max=Integer.MIN_VALUE;
            int ind=-1;
            for(int j=0;j<256;j++){
                if(freq[j]>max){
                    max=freq[j];
                    ind=j;
                }
            }
            if(max>0){
                char c=(char)ind;
                ans+=String.valueOf(c).repeat(max);
                freq[ind]=Integer.MIN_VALUE;
            }
            else{
                return ans;
            }
        }
        return ans;
    }
}