class Solution {
    List<List<String>> ans=new ArrayList<>();
    boolean isPalindrome(String s,int lo,int hi){
        while(lo<hi){
            if(s.charAt(lo)!=s.charAt(hi))
                return false;
            lo++;hi--;
        }
        return true;
    }
    void allSubString(String s,List<String> sub){
        if(s.length()==0){
            ans.add( new ArrayList<>(sub) );
            return;
        }
        for(int i=0;i<s.length();i++){
            String temp=s.substring(0,i+1);
            if(isPalindrome(temp,0,i)){
                sub.add(temp);
                allSubString(s.substring(i+1), sub);
                sub.remove(sub.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        allSubString(s,new ArrayList<>());
        return ans;
    }
}