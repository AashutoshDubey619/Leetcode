class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> tree1 = new ArrayList<>();
        ArrayList<Integer> tree2 = new ArrayList<>();

        leafs(root1 , tree1);
        leafs(root2 , tree2);

        return tree1.equals(tree2);
    }

    public void leafs(TreeNode root , ArrayList<Integer> tree){
        if(root == null) return;

        if(root.left == null && root.right == null){
            tree.add(root.val);
            return;
        }

        leafs(root.left , tree);
        leafs(root.right , tree);
    } 
}