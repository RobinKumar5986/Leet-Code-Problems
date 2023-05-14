class Solution {
    public boolean isAnagram(String s, String t) {
//---------Brute Force Using Mapping---------//
    //     if(s.length()!=t.length() || s.length()<1) return false;
    //     HashMap<Character,Integer> map1=new HashMap<>();
    //     HashMap<Character,Integer> map2=new HashMap<>();
    //     //-------Mapping--------//
    //     for(int i=0;i<s.length();i++){
    //         char c1=s.charAt(i);
    //         char c2=t.charAt(i);
    //         if(map1.containsKey(c1)){
    //             int temp=map1.get(c1)+1;
    //             map1.put(c1,temp);
    //         }else{
    //             map1.put(c1,1);
    //         }
    //         if(map2.containsKey(c2)){
    //             int temp=map2.get(c2)+1;
    //             map2.put(c2,temp);
    //         }else{
    //             map2.put(c2,1);
    //         }
    //     }
    //     //--------Matching-------//
    //     for(int i=0;i<s.length();i++){
    //         char c1=s.charAt(i);
    //         char c2=t.charAt(i);
    //         if(map1.containsKey(c2)){
    //             int n1=map1.get(c2);
    //             int n2=map2.get(c2);
    //             System.out.println("n1 : "+n1+" n2 : "+n2);
    //             if(n1!=n2) return false;
    //         }else{
    //             return false;
    //         }
    //         if(map2.containsKey(c1)){
    //             int n1=map1.get(c1);
    //             int n2=map2.get(c1);
    //             System.out.println("n1 : "+n1+" n2 : "+n2);
    //             if(n1!=n2) return false;
    //         }else{
    //             return false;
    //         }
    //     }
    //     return true;

//------------optmized Solution------------//
        if(s.length()!=t.length() || s.length()<1) return false;

        int alpha[]=new int[26];
        int n=s.length();
        for(int i=0; i < n; i++){
            alpha[s.charAt(i) - 'a']++;
            alpha[t.charAt(i) - 'a']--;
        }
        for(int i=0;i<alpha.length;i++){
            if(alpha[i]!=0) return false;
        }
        return true;
    }
}