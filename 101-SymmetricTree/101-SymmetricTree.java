// Last updated: 21/08/2026, 16:24:26
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return root==null||check(root.left,root.right);
    }
    boolean check(TreeNode a,TreeNode b){
        if(a==null||b==null) return a==b;
        return a.val==b.val&&check(a.left,b.right)&&check(a.right,b.left);
    }
}