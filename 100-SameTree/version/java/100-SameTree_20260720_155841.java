// Last updated: 20/07/2026, 15:58:41
1class Solution {
2    public TreeNode invertTree(TreeNode root) {
3        if (root == null) {
4            return null;
5        }
6        TreeNode temp = root.left;
7        root.left = root.right;
8        root.right = temp;
9        invertTree(root.left);
10        invertTree(root.right);
11        return root;
12    }
13}