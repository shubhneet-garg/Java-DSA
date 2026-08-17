class Solution {
    int Total = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        sum(root);
        return Total;
    }
    public int sum(TreeNode root){
        if(root == null) return 0;

        int left = Math.max(0, sum(root.left));
        int right = Math.max(0, sum(root.right));

        int current = root.val + left + right;

        Total = Math.max(Total, current);

        return root.val + Math.max(left, right);
    }
}