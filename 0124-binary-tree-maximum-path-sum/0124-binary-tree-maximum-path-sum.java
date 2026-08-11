class Solution {
    int sum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        Sum(root);
        return sum;
    }
    public int Sum(TreeNode root){
        if(root == null) return 0;

        int left = Math.max(0,Sum(root.left));
        int right = Math.max(0,Sum(root.right));

        int current = left + right + root.val;

        sum = Math.max(sum, current);

        return root.val + Math.max(left,right);
    }
}