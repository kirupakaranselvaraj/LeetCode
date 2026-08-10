// Last updated: 10/08/2026, 13:40:47
1class Solution {
2    public boolean isBalanced(TreeNode root) {
3        return height(root)!=-1;
4    }
5    int height(TreeNode n){
6        if(n==null) return 0;
7        int l=height(n.left),r=height(n.right);
8        if(l==-1||r==-1||Math.abs(l-r)>1) return -1;
9        return Math.max(l,r)+1;
10    }
11}