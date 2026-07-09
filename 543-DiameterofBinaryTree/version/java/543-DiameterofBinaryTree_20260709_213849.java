// Last updated: 09/07/2026, 21:38:49
1class Solution {
2    int diameter = 0;
3    public int diameterOfBinaryTree(TreeNode root) {
4        height(root);
5        return diameter;
6    }
7    public int height(TreeNode root) {
8        if (root == null)
9            return 0;
10        int left = height(root.left);
11        int right = height(root.right);
12        diameter = Math.max(diameter, left + right);
13        return Math.max(left, right) + 1;
14    }
15}