class FindElements {
    BitSet set = new BitSet();
    void recover(TreeNode st,int parent){
        if(st == null)
            return;
        if(st.left != null){
            st.left.val = parent * 2 + 1;
            set.set(st.left.val);
            recover(st.left,st.left.val);
        }
        if(st.right != null){
            st.right.val = parent * 2 + 2;
            set.set(st.right.val);
            recover(st.right,st.right.val);
        }
    }
    public FindElements(TreeNode root) {
        set.set(0);
        root.val = 0;
        recover(root,0);
    }
    
    public boolean find(int target) {
        return set.get(target);
    }
}