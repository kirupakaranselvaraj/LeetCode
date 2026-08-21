// Last updated: 21/08/2026, 16:24:29
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null||q==null) return p==q;
        return p.val==q.val&&isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
}