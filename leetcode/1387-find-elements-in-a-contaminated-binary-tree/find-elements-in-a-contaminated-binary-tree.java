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
class FindElements {
    TreeNode contTree = new TreeNode(); 
    HashSet<Integer> set = new HashSet<>();
    public FindElements(TreeNode root) {
        contTree = root;
        contaminate(contTree);
    }
    
    public boolean find(int target) {
        return set.contains(target);
    }


    public void contaminate(TreeNode contTree){
        contTree.val = 0;

        Queue<TreeNode> q = new LinkedList<>();

        q.add(contTree);

        while(!q.isEmpty()){
            TreeNode node = q.poll();

            set.add(node.val);

            if(node.left != null){
                node.left.val = 2*node.val+1;
                q.add(node.left);
             }
            if(node.right != null){
                node.right.val = 2*node.val+2;
                q.add(node.right);
            }
        }
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */