class Solution {
    String ans=null;

    public String smaller(String s1, String s2) {
        int minLength = Math.min(s1.length(), s2.length());
        for (int i = 0; i < minLength; i++) {
            if (s1.charAt(i) < s2.charAt(i)) {
                return s1;
            } else if (s1.charAt(i) > s2.charAt(i)) {
                return s2;
            }
        }
        return (s1.length() < s2.length()) ? s1 : s2;
    }
    void dfs(TreeNode root,String s){
        if(root==null)
            return;
        if(root.left==null && root.right==null){
            s=(char)(root.val+'a')+ s;
            if(ans==null)
                ans=s;
            else
                ans=smaller(ans,s);
            return;
        }
        dfs(root.left,(char)(root.val+'a')+ s);
        dfs(root.right,(char)(root.val+'a')+ s); 
    }
    public String smallestFromLeaf(TreeNode root) {
        dfs(root,"");
        return ans;
    }
}