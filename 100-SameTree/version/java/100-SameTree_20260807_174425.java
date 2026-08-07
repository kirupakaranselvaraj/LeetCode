// Last updated: 07/08/2026, 17:44:25
1class Solution {
2    public boolean isSameTree(TreeNode p, TreeNode q) {
3        if(p==null||q==null) return p==q;
4        return p.val==q.val&&isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
5    }
6}