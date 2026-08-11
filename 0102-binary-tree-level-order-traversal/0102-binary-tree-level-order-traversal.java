class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;

        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()){

            int size = q.size();

            List<Integer> level = new ArrayList<>();

            for(int i=0;i<size;i++){
                TreeNode Node = q.poll();
                level.add(Node.val);

                if(Node.left != null){
                    q.add(Node.left);
                }

                if(Node.right != null){
                    q.add(Node.right);
                }
            }
            ans.add(level);
        }
        return ans;
    }
}