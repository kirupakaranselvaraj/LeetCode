// Last updated: 07/08/2026, 17:46:05
1class Solution {
2    public boolean isSymmetric(TreeNode root) {
3        return root==null||check(root.left,root.right);
4    }
5    boolean check(TreeNode a,TreeNode b){
6        if(a==null||b==null) return a==b;
7        return a.val==b.val&&check(a.left,b.right)&&check(a.right,b.left);
8    }
9}