/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = postorder.length;
        return build(0, n-1, 0, n-1, inorder, postorder);
    }
    public TreeNode build(int inlo, int inhi, int postlo, int posthi, int[] inorder, int[] postorder){
        if(inlo > inhi || postlo > posthi) return null;
        int val = postorder[posthi];

        TreeNode root = new TreeNode(val);
        int r = 0;

        for(int i=inlo; i<=inhi; i++){
            if(inorder[i] == val){
                r = i;
                break;
            }
        }
        int cnt = r - inlo;

        root.left = build(inlo, r-1, postlo, postlo+cnt-1, inorder, postorder);
        root.right = build(r+1, inhi, postlo+cnt, posthi-1, inorder, postorder);
        return root;
    }
}