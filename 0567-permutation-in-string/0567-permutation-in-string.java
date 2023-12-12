class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length() < s1.length()) return false;
        
        int[] ar1=new int[26],ar2=new int[26];
        for(int i=0;i<s1.length();i++){
            ar1[s1.charAt(i) - 'a' ]++;
            ar2[s2.charAt(i) - 'a']++;
        }
        if(Arrays.equals(ar1,ar2)) return true;

        int lo=s1.length();
        int hi=s2.length();

        for(int i=lo; i<hi ;i++ ){
            //Entry
            ar2[s2.charAt(i)- 'a']++;
            //Exit
            ar2[s2.charAt(i-lo) -'a']--;

            if(Arrays.equals(ar1,ar2)) return true;
        }
        return false;        
    }
}