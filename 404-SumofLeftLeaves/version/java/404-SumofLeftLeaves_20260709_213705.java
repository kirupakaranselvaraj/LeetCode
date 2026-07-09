// Last updated: 09/07/2026, 21:37:05
1class Solution {
2    public int sumOfLeftLeaves(TreeNode root) {
3        if (root == null) {
4            return 0;
5        }
6        int sum = 0;
7        if (root.left != null &&
8            root.left.left == null &&
9            root.left.right == null) {
10
11            sum += root.left.val;
12        }
13        sum += sumOfLeftLeaves(root.left);
14        sum += sumOfLeftLeaves(root.right);
15        return sum;
16    }
17}