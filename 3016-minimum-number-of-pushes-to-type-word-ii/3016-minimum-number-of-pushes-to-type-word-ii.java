class Solution {
    public int minimumPushes(String word) {
        int freq[]=new int[26];
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            freq[c-'a']++;
        }
        Arrays.sort(freq);
        int len=freq.length-1;
        int step=1;
        int min=0;
        for(int i=1;i<=3;i++){
            for(int j=len-(8*(i-1)) ; j>len-(8*i);j--){
               min+=freq[j]*step;
            }
            step++;
        }
        min+=freq[1]*step;
        min+=freq[0]*step;        
        return min;
    }
}