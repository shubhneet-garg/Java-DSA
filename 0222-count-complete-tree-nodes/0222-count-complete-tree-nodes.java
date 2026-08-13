class Solution {
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        
        int leftheight = getleftheight(root);
        int rightheight = getrightheight(root);

        if(leftheight == rightheight) return (1<<leftheight) - 1;

        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public int getleftheight(TreeNode root){
        int height = 0;

        while(root != null){
            height++;
            root = root.left;
        }
        return height;
    }

    public int getrightheight(TreeNode root){
        int height = 0;

        while(root != null){
            height++;
            root = root.right;
        }
        return height;
    }
}