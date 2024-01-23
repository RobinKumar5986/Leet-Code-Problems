class Solution {
    boolean unique(String uni){
        int[] freq=new int[26];
        for(int i=0;i<uni.length();i++){
            char c=uni.charAt(i);
            freq[c-'a']++;
            if(freq[c-'a']>1)return false;
        }
        return true;
    }
    public int maxLength(List<String> arr) {
        int max=0;
        for(int i=0;i<(1 <<arr.size() ) ;i++){ //2^n
            String uni="";
            for(int j=0;j<arr.size();j++){
                if((i & (1 << j))!=0){ //2^J is not set bit.
                    uni+=arr.get(j);
                    if(uni.length()>26)
                        break;
                }
            }
            if(uni.length()<=26 && unique(uni)){
                if(uni.length()>max)
                    max=uni.length();
            }
        }
        return max;
    }
}