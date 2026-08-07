// Last updated: 07/08/2026, 17:45:33
1class Solution {
2    public TreeNode sortedArrayToBST(int[] nums) {
3        return build(nums,0,nums.length-1);
4    }
5    TreeNode build(int[] a,int l,int r){
6        if(l>r) return null;
7        int m=(l+r)/2;
8        TreeNode n=new TreeNode(a[m]);
9        n.left=build(a,l,m-1);
10        n.right=build(a,m+1,r);
11        return n;
12    }
13}