// Last updated: 09/07/2026, 09:11:30
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postorder(root, list);
        return list;
    }
    public void postorder(TreeNode root, List<Integer> list) {
        if (root == null)
            return;
        postorder(root.left, list);
        postorder(root.right, list);
        list.add(root.val);
    }
}