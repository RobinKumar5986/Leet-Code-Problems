// class Solution {
//     public int countSubstrings(String s) {
//         //------solution------//
//         if(s.length()<=0) return 0;
//         int c=0;
//         for(int i=0;i<s.length();i++){
//             int x=i;
//             int y=i;
//             while(x>=0 && y<s.length() && s.charAt(x)==s.charAt(y)){
//                 x--;
//                 y++;
//                 c++;
//             }
//             x=i;
//             y=i+1;
//             while(x>=0 && y<s.length() && s.charAt(x)==s.charAt(y)){
//                 x--;
//                 y++;
//                 c++;
//             }
//         }
//         return c;
//     }
// }


// class Solution {
//     public int countSubstrings(String s) {
//         //------solution------//
//         if(s.length()<=0) return 0;
//         int c=0;
//         for(int i=0;i<s.length();i++){
//             int len1=expand(s,i,i+1);
//             int len2=expand(s,i,i);
//             c+=len1+len2;
//         }
//         return c;

//     }
//     public int expand(String s,int i,int j){
//         int c=0;
//         while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
//             i--;
//             j++;
//             c++;
//         }
//         return c;
//     }
// }

class Solution {
    public int countSubstrings(String S) {
        int len = S.length(), ans = 0;
        for (int i = 0; i < len; i++) {
            int j = i - 1, k = i;
            while (k < len - 1 && S.charAt(k) == S.charAt(k+1)) k++;
            ans += (k - j) * (k - j + 1) / 2;
            i = k++;
            while (j >= 0 && k < len && S.charAt(k++) == S.charAt(j--)) ans++;
        }
        return ans;
    }
}