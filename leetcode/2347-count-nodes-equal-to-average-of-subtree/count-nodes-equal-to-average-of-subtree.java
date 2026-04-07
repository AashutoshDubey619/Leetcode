class Solution {
    int num_nodes = 0;

    public int averageOfSubtree(TreeNode root) {
        if(root == null) return 0;

        int sumroot = sum(root);
        int n = countnodes(root);

        if((sumroot / n) == root.val) num_nodes++;

        averageOfSubtree(root.left);
        averageOfSubtree(root.right);

        return num_nodes;
    }

    public int sum(TreeNode root){
        if(root == null) return 0;

        return root.val + sum(root.left) + sum(root.right);
    }

    public int countnodes(TreeNode root){
        if(root == null) return 0;

        return 1 + countnodes(root.left) + countnodes(root.right);
    }
}