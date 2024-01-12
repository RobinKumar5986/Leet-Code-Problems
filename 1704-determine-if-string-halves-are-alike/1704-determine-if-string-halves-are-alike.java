class Solution {
    public boolean halvesAreAlike(String s) {
        char[] map=s.toCharArray();
        int lo=0;
        int hi=s.length()-1;
        int count=0;
        while(lo<hi){
            System.out.println("aeiouAEIOU".indexOf(map[lo])+ " : "+ map[lo]); 
            if("aeiouAEIOU".indexOf(map[lo]) !=-1)count++;
            if("aeiouAEIOU".indexOf(map[hi]) !=-1)count--;
            lo++;
            hi--;
        }
        if(count==0)return true;
        return false;
    }
}