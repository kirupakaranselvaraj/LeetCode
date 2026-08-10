// Last updated: 10/08/2026, 15:41:25
1class Solution {
2    public int minDepth(TreeNode root) {
3        if(root==null) return 0;
4        if(root.left==null) return minDepth(root.right)+1;
5        if(root.right==null) return minDepth(root.left)+1;
6        return Math.min(minDepth(root.left),minDepth(root.right))+1;
7    }
8}